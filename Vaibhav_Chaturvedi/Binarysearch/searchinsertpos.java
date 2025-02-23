
package Binarysearch;
import java.util.*;

public class searchinsertpos {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int medium =start+ (end -start) / 2;
            if (nums[medium] == target) {
                return medium;
            } 
            if (nums[medium] < target) {
                start = medium + 1;
            } else {
                end = medium - 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter target value");
        int target=sc.nextInt();
        System.out.println("enter no. of values to enter");
        int m=sc.nextInt();
        int [] nums=new int[m];
        for(int i=0;i<m;i++){
            nums[i]=sc.nextInt();
        }
        int ans = searchInsert(nums,target);
        System.out.println(ans);
    }
 }
 