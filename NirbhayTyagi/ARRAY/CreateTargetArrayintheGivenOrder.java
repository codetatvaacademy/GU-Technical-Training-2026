import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class CreateTargetArrayintheGivenOrder{
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++)
        {
           list.add(index[i],nums[i]);
        } 
        int[] target = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            target[i]=list.get(i);
        }   
        return target;
     }

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the no of elements in nums array");
         int n = sc.nextInt();
         int[] nums = new int[n];
         System.out.println("Enter the elements of th enums array:");
         for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
         }
         int[] index = new int[n];
         System.out.println("Enter the elements of the index array:");
         for(int i = 0; i < n; i++){
            index[i] = sc.nextInt();
         }
         System.out.println("The resultant list is " + Arrays.toString(createTargetArray(nums, index)));
     }
}