package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
           Arrays.sort(nums);
           int maxSum =0;
           for(int i=0;i<nums.length;i+=2){
              maxSum+=nums[i];
           }
            return maxSum;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int nums[] = new int[n];
            for(int i=0;i<nums.length;i++){
                nums[i] = sc.nextInt();
            }
            ArrayPartition ap = new ArrayPartition();
            System.out.println(ap.arrayPairSum(nums));
        }
    }

