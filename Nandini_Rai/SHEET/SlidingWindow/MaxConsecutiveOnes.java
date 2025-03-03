import java.util.Scanner;

public class MaxConsecutiveOnes {
        public int findMaxConsecutiveOnes(int[] nums) {
            int start=0;
            int maxLength =0;
            for(int end=0;end<nums.length;end++){
                if(nums[end]==0){
                    start = end+1;
                }else{
                    maxLength = Math.max(maxLength,end-start+1);
                }
            }
         return maxLength;      
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  nums[] = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        MaxConsecutiveOnes mo = new MaxConsecutiveOnes();
        System.out.println(mo.findMaxConsecutiveOnes(nums));
    }
}
