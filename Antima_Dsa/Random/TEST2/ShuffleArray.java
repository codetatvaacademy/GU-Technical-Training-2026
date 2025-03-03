import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int idx = sc.nextInt();
        sc.close();

        System.out.println(Arrays.toString(shuffle(nums, idx)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] answer = new int[nums.length];
        answer[0]=nums[0];
        int j=1;
        int x = n;
        for(int i=1; i<x; i++){
            answer[j] = nums[n];
            j++;
            answer[j]=nums[i];
            j++;
            n++;
        }
        if(nums.length>1){
            answer[j]=nums[n];
        }
        return answer;
    }
}