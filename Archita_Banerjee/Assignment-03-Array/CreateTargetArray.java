import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateTargetArray {
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            target.add(index[i], nums[i]);
        }
        int []result= new int[target.size()];
        for(int i=0;i<target.size();i++){
            result[i]= target.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the nums array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements of nums array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] index = new int[n];
        System.out.println("Enter elements of index array: ");
        for (int i = 0; i < n; i++) {
            index[i] = sc.nextInt();
        }
        int[] result = createTargetArray(nums, index);

        System.out.println("The target array is: ");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
