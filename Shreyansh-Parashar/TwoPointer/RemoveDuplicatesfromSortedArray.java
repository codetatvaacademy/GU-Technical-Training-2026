import java.util.*;
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int j = 1;
        int value = nums[0];
        while(j < nums.length){
            if(value != nums[j]){
                nums[i] = nums[j];
                value = nums[j];   
                i++;
            }
            j++;
        } 
        return i;
    }
    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArray obj = new RemoveDuplicatesfromSortedArray();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int i = obj.removeDuplicates(nums);

        System.out.println(i);
        sc.close();
    }
}
