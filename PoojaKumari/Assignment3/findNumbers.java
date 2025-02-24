import java.util.Scanner;
public class findNumbers {
    public static int findEvenNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9 && nums[i]<100 || nums[i]>999 && nums[i]<10000 ||nums[i]==100000){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter the elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int result=findEvenNumbers(nums);
        System.out.print(result);
        sc.close();

    }
}
