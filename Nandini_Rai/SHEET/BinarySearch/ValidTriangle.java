import java.util.Arrays;
import java.util.Scanner;

public class ValidTriangle {
 
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count =0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                int sum = nums[i]+nums[j];
                int min = j+1, max = nums.length-1;
                while(min<=max){
                    int mid = (min+max)/2;
                    if(nums[mid]<sum){
                        min = mid+1;
                    }
                    else{
                        max = mid-1;
                    }
                }
                count += min-(j+1);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        ValidTriangle vt = new ValidTriangle();
        int result = vt.triangleNumber(nums);
        System.out.println(result);
    }
}
