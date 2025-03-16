import java.util.Scanner;

public class FirstAndLastPosition {
        public int[] searchRange(int[] nums, int target) {
            int result[] = {-1,-1};
            int min = 0;
            int max = nums.length-1;
            while(min<=max){
                int mid= (min+max)/2;
                if(nums[mid]==target){
                    result[0]=mid;
                    max = mid-1;
                }
                else if(nums[mid]<target){
                  min = mid+1;
                }
                else{
                    max = mid-1;
                }
            }
            min=0;
            max = nums.length-1;
            while(min<=max){
                int mid =(min+max)/2;
                if(nums[mid]==target){
                    result[1] = mid;
                    min = mid+1;
                }
                else if(nums[mid]>target){
                    max = mid-1;
                }
                else{
                    min = mid+1;
                }
            }
            return result;
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
      
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        FirstAndLastPosition fl = new FirstAndLastPosition();
        int[] result = fl.searchRange(nums, target);

        System.out.println( result[0] + " " + result[1]);
    }
}
