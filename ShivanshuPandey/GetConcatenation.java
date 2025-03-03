

import java.io.BufferedReader;
// import java.io.IOException;
import java.io.InputStreamReader;
public class GetConcatenation {
    
    private static int[] getConcatenation(int[] nums){
        int[] result = new int[nums.length * 2];
        for(int i = 0; i < result.length; i++){
            result[i] = nums[i % nums.length];
    
        }
        return result;
    }
    public static void main(String[] args) {
        // int[] nums = {1,2,1};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the size of the array");
            int n = Integer.parseInt(br.readLine());
            int[] nums = new int[n];
            System.out.println("Enter the elements of the array");
            for(int i=0;i<n;i++){
                nums[i] = Integer.parseInt(br.readLine());
            }
            int[] result = getConcatenation(nums);
            for(int i=0; i<result.length;i++)
            System.out.print(result[i] + " ");
        }
        catch (Exception e) {
            System.out.println("Error");
        }
    }  
}
