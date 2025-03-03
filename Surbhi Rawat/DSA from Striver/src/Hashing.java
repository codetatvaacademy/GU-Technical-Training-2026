import java.sql.SQLOutput;
import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = in.nextInt();
        System.out.println("Enter elements of array : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int hash[] = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }
        System.out.println("Enter no. of element you'll find : ");
        int q = in.nextInt();
        System.out.println("Enter the element : ");
        while(q--!=0){
            int num = in.nextInt();
            System.out.println(hash[num]);
        }
    }
}
