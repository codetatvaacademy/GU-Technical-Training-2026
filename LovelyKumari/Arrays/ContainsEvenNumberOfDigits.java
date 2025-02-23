package Arrays;
import java.util.Scanner;

public class ContainsEvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int evenCount=0;
        for(int i=0; i<nums.length; i++){
            boolean ans= evenDigits(nums[i]);
            if(ans){
                evenCount++;
            }
        }
        return evenCount;
    }
    public static boolean evenDigits(int num){
        int count=0;
        while(num > 0){
            count++;
            num /= 10;
        }
        if(count % 2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements(n) : ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the elments of nums[i]: ");
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        int answer = findNumbers(nums);
        System.out.println("Output: " + answer);
    }
    
}
