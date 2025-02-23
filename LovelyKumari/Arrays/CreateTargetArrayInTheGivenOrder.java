package Arrays;
import java.util.Scanner;

public class CreateTargetArrayInTheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
    
        int [] target= new int[index.length];
        for(int i=0; i<index.length;i++){
            for(int j=i; j>index[i];j--){
                target[j]=target[j-1];
            } target[index[i]]= nums[i];
        }
        return target;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        int[] index=new int[n];
        System.out.println("Enter the nums array's elements: ");
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the index's array elements: ");
        for(int i=0; i<n; i++){
            index[i]=sc.nextInt();
        }
        CreateTargetArrayInTheGivenOrder obj=new CreateTargetArrayInTheGivenOrder();
        int[] answer=obj.createTargetArray(nums, index);

        System.out.println("Output: ");
        for(int num:answer){
            System.out.print(num+" ");
        }
    }
}
