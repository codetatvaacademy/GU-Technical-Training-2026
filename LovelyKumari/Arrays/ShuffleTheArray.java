package Arrays;
import java.util.Scanner;

public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) { // Brute Force Approach 
        /*
    
            int [] ans = new int[2*n] ;
    
            int p=0;
    
            for(int i=0; i<2*n ; i=i+2){
                ans[i] = nums[p];
                ans[i+1] = nums[p+n];
                p++ ;
    
            }
            return ans;
        */
    
        //Optimized approach TC : O(n) , SC : O(1)
        for(int i=0; i<n ; i++){
            nums[i+n] += nums[i]*1001;
    
        }  
        for(int i=0;i<n; i++){
            nums[2*i]=nums[i+n] / 1001;
            nums[2*i + 1] = nums[i+n] % 1001 ;
        }
        return nums ;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter half length array size[(n)]: ");
        int n=sc.nextInt();
        int[] nums= new int[2*n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<2*n; i++){
            nums[i]=sc.nextInt();
        }
        int[] answer= shuffle(nums , n);
        System.out.print("Shuffled array: ");
        for(int num:answer){
            System.out.print(num + " ");
        }
    }
    
}
