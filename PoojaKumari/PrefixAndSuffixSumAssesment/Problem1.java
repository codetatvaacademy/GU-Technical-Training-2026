//package GU-Technical-Training-2026.PoojaKumari.PrefixAndSuffixSumAssesment;
import java.util.*;

public class Problem1 {
    public static int calculateSum(int[] nums,int answer){
        int[] leftSum=new int[nums.length];
        int[] rightSum=new int[nums.length];
        //int answer=0;
        leftSum[0]=0;
        rightSum[rightSum.length-1]=0;
        //for rightSum 
        for(int i=1;i<leftSum.length;i++){
            leftSum[i]+=nums[i-1];

        }
        //for leftSum
        for(int j=rightSum.length-1;j>1;j--){
            rightSum[j]+=nums[j+1];
        }
        for(int k=0;k<nums.length;k++){
            if(leftSum[k]==rightSum[k]){
                answer++;
            }
            else {
                answer=-1;
            }
        }
        return answer;


    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter weights in form of array: ");
        int num1= sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int answer=0;
        int[] nums={num1,num2,num3};
       // calculateSum(nums);
       answer=calculateSum(nums, answer);
       System.out.println(+answer);

        
        
        
        
        


    }
    ///time complesixity for leftSum=O(N)
    /// time complexity for rightSum=O(N)
    /// time complexity for answer=O(n)
    /// total time compleexity=O(N)
    //Space complexity =O(1)
}
