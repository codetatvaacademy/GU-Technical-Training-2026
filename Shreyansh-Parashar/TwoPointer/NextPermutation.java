import java.util.*;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        int index1 = -1;
        int index2 = -1;
        while(i>=0){
            if(nums[i] < nums[i+1]){
                index1 = i;
              break;  
            }
            i--;  
        }
        if(index1 == -1){
            reverse(nums,0);
        }else{
            int j = nums.length - 1;
            while(j >= 0){
                if(nums[j] > nums[index1]){
                    index2 = j;
                    break;
                }
                j--;
            } 
            swap(nums,index1,index2);
            reverse(nums,index1+1);
        }
        
    }
    private void reverse(int[] nums, int start){
        int end = nums.length-1;
        while(start < end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    private void swap(int nums[], int start,int end){
        int temp = nums[end];
        nums[end] = nums[start];
        nums[start] = temp;
    }
    public static void main(String[] args) {
        NextPermutation obj = new NextPermutation();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        obj.nextPermutation(nums);

        System.out.println(Arrays.toString(nums));
    }
}
