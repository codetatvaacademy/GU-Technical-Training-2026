import java.util.*;
public class ArrayConcatenation{
    public  static int[] getConcatenation(int[] nums) {
        int[] arr= new int[2*nums.length];
        for(int i=0; i<nums.length;i++){
            arr[i]=nums[i];
            arr[i+nums.length]=nums[i];
        }
        return arr;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of Array:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter elements of array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int[] result=new int[2*n];
        result=getConcatenation(nums);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]);
        }
        sc.close();
    }
}