import java.util.Scanner;

class RemoveDuplicatesfromSortedArrayII{
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n<=2){
            return n;
        }
        int k = 2;
        for(int i = 2; i < n; i++) {
            if (nums[i] != nums[k-2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        removeDuplicates(nums);
        System.out.println("The resultant array is ");
        for(int i = 0; i < n; i++){
            System.out.print(nums[i] + " ");
        }
    }
}   
