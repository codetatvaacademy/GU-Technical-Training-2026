import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MajorityElementII{
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int cnt1 = 0; 
        int cnt2 = 0; 
        int majorityElement1 = 0;
        int majorityElement2 = 0;         
        for (int i = 0; i < n; i++) {           
            if (cnt1 == 0 && nums[i] != majorityElement2) {
                cnt1 = 1;
                majorityElement1 = nums[i];
            } 
           
            else if (cnt2 == 0 && nums[i] != majorityElement1) {
                cnt2 = 1;
                majorityElement2 = nums[i];
            } 
            
            else if (majorityElement1 == nums[i]) {
                cnt1++;
            } else if (majorityElement2 == nums[i]) {
                cnt2++;
            } 
            
            else {
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> result = new ArrayList<>();      
        cnt1 = 0;
        cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (majorityElement1 == nums[i]) {
                cnt1++;
            } else if (majorityElement2 == nums[i]) {
                cnt2++;
            }
        }       
        if (cnt1 > n / 3) {
            result.add(majorityElement1);
        }
        if (cnt2 > n / 3) {
            result.add(majorityElement2);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the nums");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the nums array:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("The resultant array is: " + majorityElement(nums));
    }
}

//time complexity of the function is: O(n)
//space complexity of the function is: O(n)

//time complexity of the whole program is: O(n)
//space complexity of the whole program is: O(n)