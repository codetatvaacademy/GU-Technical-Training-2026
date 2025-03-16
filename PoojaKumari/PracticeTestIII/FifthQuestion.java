import java.util.*;
public class FifthQuestion {
    public static double findMaxAverage(int[] nums,int k){
        double maxAverage=0.0;
        int start=0;
        int end=0;
        while(end<nums.length){
            double average=sum/k;
            int length=end-start+1;
            if(length>k){
                maxAverage=Math.max(maxAverage,average);
                start++;
                k--;
            }
            
        end++;
        }
        return maxAverage;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array and value of k:");
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int result=0;
        result=findMaxAverage(nums,k);
        System.out.println(result);
    }
    
}
