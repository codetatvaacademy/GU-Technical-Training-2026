// 414. Third Maximum Number

import java.util.Scanner;

class thirdMaximumNumber{
    public static int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for (int num : nums) {
            if (num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num > thirdMax && num != secondMax && num != firstMax) {
                thirdMax = num;
            }
        }
        return (int) (thirdMax != Long.MIN_VALUE ? thirdMax : firstMax);
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
        System.out.println(thirdMax(nums));
        sc.close();
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)