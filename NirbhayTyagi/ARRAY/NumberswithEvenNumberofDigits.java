import java.util.Scanner;

class NumberswithEvenNumberofDigits{
    public static int findNumbers(int[] nums) {
        int evenNumber = 0;
        for(int num : nums){
         if((num > 9 && num < 100) || (num > 999 && num < 10000) || num == 100000){
             evenNumber++;
         }
        } 
        return evenNumber;
     }

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of elements of array:");
         int n = sc.nextInt();
         int[] nums = new int[n];
         System.out.println("Enter the elements of the array:");
         for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
         }
         System.out.println("The numbers of even numbers is:" + findNumbers(nums));
     }
}