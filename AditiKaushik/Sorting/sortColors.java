// 75. Sort Colors

import java.util.Arrays;
import java.util.Scanner;

class sortColors{
    public static void sort_Colors(int[] nums) {
        int red = 0;
        int blue = nums.length - 1;
        int i = 0;    
        while (i <= blue) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[red];
                nums[red] = temp;
                i++;
                red++;
            }
            else if (nums[i] == 1) {
                i++;
            }
            else {
                int temp = nums[i];
                nums[i] = nums[blue];
                nums[blue] = temp;
                blue--;
            }
        }
        System.out.println(Arrays.toString(nums));
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
        sort_Colors(nums);
        sc.close();
    }
}

//Time Complexity: O(n)
//Space Complexity: O(1)