import java.util.Scanner;

class SubarraySumsDivisiblebyK{
    public static int subarraysDivByK(int[] nums, int k) {
        int[] arr = new int[k];
        arr[0] = 1;
        int count = 0;
         int sum = 0;
        for(int num : nums){
            sum += num;
            int remainder = (sum % k + k) % k;
            count += arr[remainder];
            arr[remainder]++;  
        }
        return count;
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
        System.out.println("Enter the vlaue of k");
        int k = sc.nextInt();
        System.out.println("The resultant array is: " + subarraysDivByK(nums, k));
    }
}

//time complexity of the function is: O(n)
//space complexity of the function is: O(k)

//time complexity of the function is: O(n)
//space complexity of the function is: O(n + k)