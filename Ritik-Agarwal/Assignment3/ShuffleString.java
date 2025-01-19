import java.util.Scanner;

public class ShuffleString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(restoreString(s, nums));
    }
    public static String restoreString(String s, int[] indices) {
        char arr[] = new char[indices.length];
        int j=0;
        for(int i:indices){
            arr[i] = s.charAt(j);
            j++;
        }
        return String.valueOf(arr);
    }
}