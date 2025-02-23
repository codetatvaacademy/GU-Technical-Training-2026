package Arrays;
import java.util.Scanner;

public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] shuffledString = new char[s.length()];

        for(int i=0; i< s.length(); i++){
            shuffledString[indices[i]] = s.charAt(i);
        }
          return new String(shuffledString);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string (s)");
        String s=sc.nextLine();

        int n=s.length();
        int[] indices=new int[n];

        System.out.println("Enter the indices array : ");
        for(int i=0; i<n; i++){
            indices[i]=sc.nextInt();
        }
        ShuffleString obj=new ShuffleString();
        String restoredString=obj.restoreString(s, indices);
        System.out.print("Output: " + restoredString);
    }  
}
