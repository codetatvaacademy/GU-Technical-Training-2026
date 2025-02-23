import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CreateTargetArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int[] index = new int[n];
        for(int i=0; i<n; i++){
            index[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
    private static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            ans.add(index[i], nums[i]);
        }
        int[] res = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}