package Arrays;
import java.util.Scanner;
import java.util.*;

public class DecompressRunLengthEncodedList {
    public static int[] decompressRLElist(int[] nums) {
        List <Integer> ans = new ArrayList<>();
        int n=nums.length;
        for(int i=0; i<n; i+=2){
            int freq = nums[i] ;
            int val= nums[i + 1];

            for(int j=0; j<freq ; j++){
                ans.add(val);   
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        
        return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();

        //to ensure the length of the array is even
        while (n % 2 != 0) {
            System.out.println("Array length should of in even pairs of (Freq , val).. Please try again!  ");
            System.out.println();
        }
        int[] nums=new int[n];
        System.out.println("Enter the nums array(freq , val) : ");
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        DecompressRunLengthEncodedList obj=new DecompressRunLengthEncodedList();
        int[] answer=obj.decompressRLElist(nums);

        System.out.println("Output: ");
        for(int num: answer){
            System.out.print(num+" ");
        }
    }
}
