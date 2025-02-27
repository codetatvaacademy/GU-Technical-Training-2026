import java.util.Scanner;

public class SearchInRotatedArray {
        public int search(int[] nums, int target) {
           int min=0;
           int max = nums.length-1;
            while(min<=max){
                int mid=(max+min)/2;
                if(nums[mid]==target){
                    return mid;
                }
                if(nums[min]<=nums[mid]){
                if(nums[min]<=target && target<nums[mid]){
                    max = mid-1;
                }
                else{
                    min = mid+1;
                }
                }
                else{
                    if(nums[mid]<= target && target<=nums[max]){
                        min = mid+1;
                    }else{
                        max = mid-1;
                    }
                }
            }
             return -1;
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
       
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        
        SearchInRotatedArray sr = new SearchInRotatedArray();
        int result = sr.search(nums, target);

        System.out.println(result);
    }
}
