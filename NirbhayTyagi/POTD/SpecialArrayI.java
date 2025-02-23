package POTD;

import java.util.Scanner;

public class SpecialArrayI{
    public static boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n - 1; i++){
            if(nums[i] % 2 == nums[i + 1] % 2){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(isArraySpecial(nums));
        sc.close();
    }
}