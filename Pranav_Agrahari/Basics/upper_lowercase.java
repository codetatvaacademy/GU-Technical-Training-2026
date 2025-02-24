import java.util.Scanner;

public class upper_lowercase {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Character");
        char ch = sc.next().charAt(0);

        if (ch >= 65 && ch <=90) {
            System.out.println("Capital Letter ");
        }
        else if (ch >= 97 && ch <=122) {
            System.out.println("Small Letter");
        }
        else {
            System.out.println("Invalid Input ");
        }

    }
}
