import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class MakeSumDivisiblebyP{
     public static int minSubarray(int[] nums, int p) {
        int n = nums.length;
        long sum = 0;
        long totalSum = 0;
        int minLength = n;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int num : nums){
            totalSum += num % p;
        }
        if(totalSum % p == 0){
            return 0;
        }
        int need = (int)(totalSum % p);
        for(int i = 0; i < n; i++){
            sum = (int)((sum + nums[i]) % p);
            int want = (int)((sum - need + p) % p);

            if(map.containsKey(want)){
                minLength = Math.min(minLength, i - map.get(want));
            }
                map.put((int)sum, i);
            
        }
        if(minLength == n){
            return -1;
        }

        return minLength;

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
        System.out.println("Enter the vlaue of p");
        int p = sc.nextInt();
        System.out.println("The resultant array is: " + minSubarray(nums, p));
    }
}

//time complexity of the function is: O(n)
//space complexity of the function is: O(1)

//time complexity of the function is: O(n)
//space complexity of the function is: O(n)