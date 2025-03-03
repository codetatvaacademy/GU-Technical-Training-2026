import java.util.Scanner;

public class minValueToGetPositive {
    public  static int minStartValue(int[] nums) {
        int minValue = nums[0];
        for (int i = 1; i<nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        for (int i = 0; i<nums.length; i++) {
            if (nums[i] < minValue) {
                minValue = nums[i];
            }
        }
        if(minValue<0){
            return minValue*(-1)+1;

        }
        else{
            return 1;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter the elements of Array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int result=minStartValue(nums);
        System.out.print(result);

        sc.close();
    }
}
