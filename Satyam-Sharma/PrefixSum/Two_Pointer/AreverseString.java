import java.util.Scanner;

public class AreverseString {
    public static void reverseString(char[] s) {
        int low =0;
        int high = s.length-1;
        while(low < high){
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        char[] s = str.toCharArray();
        reverseString(s);
        System.out.println("Reversed string: ");
    }
}
