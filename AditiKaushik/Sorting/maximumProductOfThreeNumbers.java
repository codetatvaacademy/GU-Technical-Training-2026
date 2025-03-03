// 628. Maximum Product of Three Numbers

import java.util.Scanner;

class maximumProductOfThreeNumbers{
    public static int maximumProduct(int[] nums) {
        int ma1 = Integer.MIN_VALUE;
        int ma2 = Integer.MIN_VALUE;
        int ma3 = Integer.MIN_VALUE;
        int mi1 = Integer.MAX_VALUE;
        int mi2 = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > ma1) {
                ma3 = ma2;
                ma2 = ma1;
                ma1 = num;
            } else if (num > ma2) {
                ma3 = ma2;
                ma2 = num;
            } else if (num > ma3) {
                ma3 = num;
            }
            if (num < mi1) {
                mi2 = mi1;
                mi1 = num;
            } else if (num < mi2) {
                mi2 = num;
            }
        }
        return Math.max(mi1 * mi2 * ma1, ma1 * ma2 * ma3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i =0; i< size; i++){
            System.out.println("Enter element " + (i+1) + " : ");
            nums[i] = sc.nextInt();
        }
        System.out.println(maximumProduct(nums));
        sc.close();
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)