
import java.util.Arrays;
import java.util.Scanner;

class SumClosest{
    public static int threeSumClosest(int[] nums, int target) {
        int minDiff = Integer.MAX_VALUE;
        int sum = 0; 
        Arrays.sort(nums);
        int j;
        int k;
        for(int i = 0; i < nums.length; i++){
            j = i + 1;
            k = nums.length - 1;
            while(j < k){
               
                // diff = Math.abs(sum - target);
                if(Math.abs(nums[i] + nums[j] + nums[k]- target) < minDiff){
                    minDiff = Math.abs(nums[i] + nums[j] + nums[k]- target);      
                    sum = nums[i] + nums[j] + nums[k];      
                }else if(nums[i] + nums[j] + nums[k] < target ){
                     j++;
                }else{
                    k--;
                }
            } 
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();            
        }
        System.out.println("Enter the value of targetr:");
        int target = sc.nextInt();
        System.out.println("the maximum possible score is:" + threeSumClosest(nums, target));
    }
}

//time complexity of the function is : O(nlogn)
//space complexity of the function is : O(1)

//time complexity of the function is : O(nlogn)
//space complexity of the function is : O(n)