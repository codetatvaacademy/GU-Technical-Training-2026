import java.util.*;

public class CapacityToShipPackage {
    public boolean cal(int[] weights, int days, int mid) {
        int sum = 0;
        int day = 1;
        for (int i = 0; i < weights.length; i++) {
            if (sum + weights[i] > mid) {
                day += 1;
                sum = weights[i];
            } else {
                sum += weights[i];
            }
        }
        return day <= days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int min = Integer.MIN_VALUE;
        int max = 0;
        for (int i = 0; i < n; i++) {
            min = Math.max(min, weights[i]);
            max += weights[i];
        }
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (cal(weights, days, mid) == true) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }

        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of weights:");
        int n = sc.nextInt();
        System.out.print("Enter number of days:");
        int days = sc.nextInt();
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(weights);
        }
        //class called here by object //
        //1.creation of obj//
        CapacityToShipPackage obj=new CapacityToShipPackage();
        //2.calling function//
        int result=obj.shipWithinDays(weights, days);
        System.out.println("Minimum ship capacity:"+result);
        sc.close();
        
    }

}

