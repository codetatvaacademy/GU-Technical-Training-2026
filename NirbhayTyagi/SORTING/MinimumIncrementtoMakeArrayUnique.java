import java.util.Scanner;

class MinimumIncrementtoMakeArrayUnique{
    public static int minIncrementForUnique(int[] nums) {
        int maxElement = 0;
        for(int num : nums){
            maxElement = Math.max(maxElement,num);
        }
        int[] arr = new int[maxElement + nums.length];
        for(int i : nums){
            ++arr[i];
        }
        int minMoves = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= 1){
                continue;
            }
            int extra = arr[i] - 1;
            arr[i + 1] += extra;
            minMoves += extra;
        }
        return minMoves;
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in nums array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the elements of the array");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Minimum numbers of moves are :" + minIncrementForUnique(nums));
    }
}