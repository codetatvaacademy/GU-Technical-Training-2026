import java.util.Scanner;

public class BinarySearcht {
        public int search(int[] nums, int target) {
            int min=0;
            int max = nums.length-1;
            while(min<=max){
                int mid=(min+max)/2;
                if(nums[mid]==target){
                    return mid;
                }
                else if(nums[mid]<target){
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
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        BinarySearcht bs = new BinarySearcht();
        int result = bs.search(nums, target);
        System.out.println(result);
    }
}
