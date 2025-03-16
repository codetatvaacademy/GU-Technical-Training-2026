package Arrays;
import java.util.*;
public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums){
        int n=nums.length;
        int[] ans= new int[2*n];

        for(int i=0; i<n; i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("n :"); //Number of elements
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        int[] answer=getConcatenation(nums);
        System.out.println("Concatenated array: " + Arrays.toString(answer));
    }
}
