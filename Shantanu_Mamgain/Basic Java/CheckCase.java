import java.util.Scanner;

public class CheckCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char character = sc.next().charAt(0);

        if(character>='a' && character<='z'){
            System.out.println("it is lowercase character");
        }
        else if(character>='A' && character<='Z'){
            System.out.println("It is uppercase character");
        }
        else{
            System.out.println("invalid input");
        }
        sc.close();
    }
}
