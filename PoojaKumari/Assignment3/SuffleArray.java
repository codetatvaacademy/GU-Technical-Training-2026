import java.util.Scanner;
public class SuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] newArr=new int[2*n];
        for(int i=0;i<n;i++){
            newArr[2*i]=nums[i];
            newArr[2*i+1]=nums[n+i];
        }
        return newArr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int n=sc.nextInt();
        int[] nums=new int[2*n];
        System.out.print("Enter the elements of array:");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int[] result=new int[nums.length];
        result=shuffle(nums,n);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]);
        }
        sc.close();

    }
    
}
