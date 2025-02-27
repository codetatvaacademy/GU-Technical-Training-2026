import java.util.Scanner;

public class SearchInsertPosition {
        public int searchInsert(int[] nums, int target) {
            int min =0;
            int max = nums.length-1;
            while(min<=max){
                int mid = (min+max)/2;
                if(nums[mid]==target){
                    return mid;
                }
                else if(nums[mid]>target){
                 max = mid-1;
                }
                else{
                    min = mid+1;
                }
            }
            return min;
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        SearchInsertPosition sp = new SearchInsertPosition();
        int result = sp.searchInsert(nums, target);
        System.out.println(result);
    }
}
