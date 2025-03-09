import java.util.Scanner;

class MajorityElement{
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int majorityElement = nums[0];
        int count = 1;
        for(int i = 1; i < n; i++){
            if(count == 0){
                majorityElement = nums[i];
                count++;
            }
            else if(majorityElement == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return majorityElement;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the nums");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the nums array:");
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("The resultant array is: " + majorityElement(nums));
    }
}