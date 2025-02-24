import java.util.Scanner;
public class ToggleChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        sc.close();
        char tog;
        if(ch>=97 && ch<=122){
            tog = (char) (ch - 32);
        }
        else{
            tog = (char) (ch + 32);
        }
        System.out.println(ch + " is converted to: " + tog);
    }
}