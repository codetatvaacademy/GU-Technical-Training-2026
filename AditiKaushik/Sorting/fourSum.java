// 18. 4Sum

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class fourSum{
    public static List<List<Integer>> four_Sum(int[] nums, int target) {
        int arraySize = nums.length;
        List<List<Integer>> quadrupletsList = new ArrayList<>();
        if (arraySize < 4) {
            return quadrupletsList;
        }
        Arrays.sort(nums);
        for (int i = 0; i < arraySize - 3; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < arraySize - 2; ++j) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int leftPointer = j + 1, rightPointer = arraySize - 1;
                while (leftPointer < rightPointer) {
                    long currentSum = (long) nums[i] + nums[j] + nums[leftPointer] + nums[rightPointer];
                    if (currentSum < target) {
                        ++leftPointer;
                    }
                    else if (currentSum > target) {
                        --rightPointer;
                    }
                    else {
                        quadrupletsList.add(Arrays.asList(nums[i], nums[j], nums[leftPointer], nums[rightPointer]));
                        leftPointer++;
                        rightPointer--;
                        while (leftPointer < rightPointer && nums[leftPointer] == nums[leftPointer - 1]) {
                            leftPointer++;
                        }
                        while (leftPointer < rightPointer && nums[rightPointer] == nums[rightPointer + 1]) {
                            rightPointer--;
                        }
                    }
                }
            }
        }
        return quadrupletsList;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i =0; i< size; i++){
            System.out.println("Enter element " + (i+1) + " : ");
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        System.out.println(four_Sum(nums, target));
        sc.close();
    }
}

//Time Complexity: O(n^3)
//Space Complexity: O(n^2)