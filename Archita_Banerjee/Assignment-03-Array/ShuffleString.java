import java.util.Scanner;
public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
        char []result= new char[s.length()];
        for(int i=0;i<s.length();i++){
            result[indices[i]]= s.charAt(i);
        }
        return new String(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        System.out.print("Enter the length of the indices array: ");
        int n = sc.nextInt();
        int[] indices = new int[n];

        System.out.println("Enter the elements of the indices array:");
        for (int i = 0; i < n; i++) {
            indices[i] = sc.nextInt();
        }
        String restoredString = restoreString(s, indices);
        System.out.println("Restored string: " + restoredString);
    }
}
