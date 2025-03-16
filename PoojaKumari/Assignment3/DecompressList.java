import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DecompressList {
    public static int[] decompressRLElist(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                result.add(nums[i + 1]);
            }
        }
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of Array:");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter the element of array:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int[] result=decompressRLElist(nums);
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }
        sc.close();

    }
    
}