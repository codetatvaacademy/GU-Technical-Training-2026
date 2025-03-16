import java.util.Scanner;

public class CreateTargetArray {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=target.length-1;j>index[i];j--){
                target[j]=target[j-1];
            }
            target[index[i]]=nums[i];
        }
    return target;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter the elements of Array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int[] index=new int[n];
        System.out.print("Enter the indexes:");
        for(int i=0;i<n;i++){
            index[i]=sc.nextInt();
        }
        int[] result=new int[n];
        result=createTargetArray(nums,index);
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }
        sc.close();

    }
}
