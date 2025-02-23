import java.util.*;
public class GrumpyBookstoreOwner {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        
        int unSatifiedCustomer = 0;
        for(int i = 0; i < minutes; i++){
            unSatifiedCustomer += grumpy[i] * customers[i];
        }

        int maxUnsatifiedCustomer = unSatifiedCustomer;

        for(int i = minutes; i < customers.length; i++){
            unSatifiedCustomer += grumpy[i] * customers[i];
            unSatifiedCustomer -= grumpy[i - minutes] * customers[i - minutes];
            maxUnsatifiedCustomer = Math.max(maxUnsatifiedCustomer,unSatifiedCustomer);
        }

        int maxSatifiedCustomer = maxUnsatifiedCustomer;

        for(int i = 0; i < customers.length; i++){
            maxSatifiedCustomer += (1 - grumpy[i]) * customers[i];
        }
        
        return maxSatifiedCustomer;
    }
    public static void main(String[] args) {
        GrumpyBookstoreOwner obj = new GrumpyBookstoreOwner();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the minutes: ");
        int minutes = sc.nextInt();

        System.out.print("Enter the size of a customers: ");
        int m = sc.nextInt();

        int[] customers = new int[m];
        for(int i = 0; i < m; i++){
            customers[i] = sc.nextInt();
        }

        System.out.print("Enter the size of arrays(grumpy): ");
        int n = sc.nextInt();

        System.out.print("Enter the arrays{nums}: ");
        int[] grumpy = new int[n];

        for(int i = 0; i < n; i++){
            grumpy[i] = sc.nextInt();
        }

        int maxSatifiedCustomer = obj.maxSatisfied(customers, grumpy, minutes);

        System.out.print(maxSatifiedCustomer);
    }
}
