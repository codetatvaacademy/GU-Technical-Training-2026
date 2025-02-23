import java.util.Scanner;
public class q1 {
    static int middleindex(int nums[]){
        //int n=nums.length;
        int[]left=new int[nums.length];
        int []right=new int[nums.length];
        //leftsum:
         left[0]=nums[0];
         for (int i = 1; i <nums.length; i++) {
            left[i]=left[i-1]+nums[i];
            
         }
         //rightsum:
         right[nums.length-1]=nums[nums.length-1];
         for (int i=nums.length-2; i >=0; i--) {
            right[i]=right[i+1]+nums[i];

            
         }
        //compare left[i] and right[i]:
         for (int i = 0; i <nums.length; i++) {
            if(left[i]==right[i]){
                return i;
            }   
                     
         }
         return -1;



    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        System.out.print("enter the element of array: "+" ");
        //create array
        int []nums=new int[n];
        for (int i = 0; i <nums.length; i++) {
            nums[i]=sc.nextInt();
            
        }
       
       int result = middleindex(nums);
        if (result != -1) {
            System.out.println("Middle index: " + result);
        } else {
            System.out.println("No middle index found.");
        }

        
    }
}
//TC=O(N)
//SC=O(1)