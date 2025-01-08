import java.util.Scanner;

public class IsUpperOrLower {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);
        sc.close();
        if(ch>=97 && ch<=122){
            System.out.println(ch + " is lowercase.");
        }
        else if(ch>=65 && ch<=90){
            System.out.println(ch + " is uppercase.");
        }
        else{
            System.out.println(ch + " is not an alphabet.");
        }
    }
}