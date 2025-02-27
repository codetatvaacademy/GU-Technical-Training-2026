import java.util.Scanner;

public class GroupAllOnesTogether {
    public int minSwaps(int[] nums) {
            int windowSize=0;
            for(int num : nums){
                windowSize+=num;
            }
            int curZero = 0;
            for(int i=0;i<windowSize;i++){
                if(nums[i]==0){
                curZero++;
                }
            }
            int minZeros = curZero;
            int start=0;
            int end= windowSize-1;
            int n= nums.length;
            while(start<n){
                if(nums[start]==0){
                    curZero--;
                }
                start++;
    
                end++;
                if(nums[end%n]==0){
                    curZero++;
                }
                minZeros = Math.min(minZeros,curZero);
            }
            return minZeros;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int nums[] = new int[n];
            for(int i=0;i<nums.length;i++){
                nums[i] = sc.nextInt();
            }
            GroupAllOnesTogether go = new GroupAllOnesTogether();
            System.out.println(go.minSwaps(nums));
        } 
}
