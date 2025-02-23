import java.util.Scanner;

public class ConcatenationArray {
    public static int[] getConcatenation(int[] nums) {
        int n= nums.length;
        int [] ans = new int[2 * n];
        for (int i = 0; i<n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] result = getConcatenation(arr);
        System.out.println("Concatenated array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
