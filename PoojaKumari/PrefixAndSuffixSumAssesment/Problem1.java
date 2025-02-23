//package GU-Technical-Training-2026.PoojaKumari.PrefixAndSuffixSumAssesment;
import java.util.*;

public class Problem1 {
    public static int calculateSum(int[] nums){
        int[] prefixSum=new int[nums.length];
        int[] suffixSum=new int[nums.length];
        prefixSum[0]=nums[0];
        suffixSum[nums.length-1]=nums[nums.length-1];
        // for prefixsum
        for(int i=1;i<nums.length;i++){
            prefixSum[i]=nums[i]+prefixSum[i-1];
        }
        // for suffixSum
        for(int i=nums.length-2;i>=0;i--){
            suffixSum[i]=nums[i]+suffixSum[i+1];
        }
        for( int i=0;i<nums.length;i++){
            if(prefixSum[i]==suffixSum[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums=new int[n];
        System.out.println("Enter numbers of array: ");
        for(int i=0; i<n; i++){
            
            nums[i] = sc.nextInt();
        }
        int answer=0;
        
       // calculateSum(nums);
       answer=calculateSum(nums);
       System.out.println("Midle index is "+answer);
       sc.close();
    }
}
// time complesixity for leftSum=O(N)
// time complexity for rightSum=O(N)
// time complexity for answer=O(n)
// total time compleexity=O(N)
// Space complexity =O(1)
