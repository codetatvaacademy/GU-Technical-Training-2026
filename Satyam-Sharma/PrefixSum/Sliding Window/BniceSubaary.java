import java.util.Scanner;

public class BniceSubaary {
    public static int findval(int[] nums, int k){
        int start =0;
        int end = 0;
        int count = 0;
        while(end < nums.length){
            if(nums[end]%2!=0){
                k--;
            }
            while(k<0 && start<nums.length){
                if(nums[start]%2!=0){
                    k++;
                }
                start++;
            }
            count += (end-start+1);
            end++;
        }
        return count;
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        int ans1 = findval(nums, k);
        int ans2 = findval(nums, k - 1);
        return (ans1 - ans2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(numberOfSubarrays(nums, k));
    }
}
