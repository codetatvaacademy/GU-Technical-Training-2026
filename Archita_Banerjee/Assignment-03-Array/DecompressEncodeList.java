import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecompressEncodeList {
    public static int[] decompressRLElist(int[] nums) {
        List<Integer> res= new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            int freq= nums[i];
            int val= nums[i+1];
            for(int j=0;j<freq;j++){
                res.add(val);
            }

        }
        int [] ans= new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]= res.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        DecompressEncodeList d = new DecompressEncodeList();
        int[] result = d.decompressRLElist(nums);

        System.out.print("Decompressed list: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
