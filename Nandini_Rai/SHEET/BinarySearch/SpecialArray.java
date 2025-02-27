import java.util.Scanner;

public class SpecialArray {
        public int isValid(int nums[],int mid){
            int count =0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>=mid){
                    count++;
                }
            }
            return count;
        }
        public int specialArray(int[] nums) {
            int min=0;
            int max =0;
            for(int i=0;i<nums.length;i++){
                max = Math.max(max,nums[i]);
            }
            while(min<=max){
                int mid =(min+max)/2;
                if(isValid(nums,mid)==mid){
                   return mid;
                }
                else if(isValid(nums,mid)>mid){
                    min = mid+1;
                }
                else{
                    max = mid-1;
                }
            }
            return -1;
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

       SpecialArray sa = new SpecialArray();
        int result = sa.specialArray(nums);
        
        System.out.println(result);
    }
}
