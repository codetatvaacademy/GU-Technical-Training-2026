import java.util.Scanner;

public class TformarrayConcatination {
    public static int matchGroup(int[] group, int[] nums,int index){
        for(int i=index;i<=nums.length-group.length;i++){
            boolean match=true;
            for(int j=0;j<group.length;j++){
                if(group[j]!=nums[i+j]){
                    match=false;
                    break;
                }
            }
            if(match){
                return i;
            }
        }
        return -1;
    }
    public static boolean canChoose(int[][] groups, int[] nums) {
        int index=0;
        for(int[] group:groups){
            index = matchGroup(group,nums,index);
            if(index<0){
                return false;
            }
            index += group.length; 
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of groups: ");
        int n = sc.nextInt();
        int[][] groups = new int[n][];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number of elements in group " + (i + 1) + ": ");
            int m = sc.nextInt();
            groups[i] = new int[m];
            System.out.println("Enter the elements: ");
            for (int j = 0; j < m; j++) {
                groups[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number of elements in the array: ");
        int m = sc.nextInt();
        int[] nums = new int[m];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < m; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(canChoose(groups, nums));
    }
}
