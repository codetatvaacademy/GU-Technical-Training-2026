// Time Complexity - O(n) [same for whole program and calculating function]
// Space complexity - O(n) [nums integer arrray]
// n -> length of array

import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int len = sc.nextInt();

        int nums[] = new int[len];

        System.out.print("Enter elements of array: ");
        for(int i=0; i<len; i++){
            nums[i] = sc.nextInt();
        }

        sc.close();

        int ansIdx = findMiddleIndex(nums);

        //printing output
        System.out.println(ansIdx);
    }
    private static int findMiddleIndex(int[] nums){

        for(int i=1; i<nums.length; i++){                   // O(n) - time complexity
            nums[i] += nums[i-1];
        }

        int totalWeight = nums[nums.length-1];

        for(int i=0; i<nums.length; i++){                   // O(n) - time complexity
            int leftWeightSum = 0;
            if(i!=0){
                leftWeightSum = nums[i-1];
            }
            int rightWeightSum = totalWeight - nums[i];
            if(leftWeightSum==rightWeightSum){
                return i;
            }
        }
        
        return -1;
    }
}