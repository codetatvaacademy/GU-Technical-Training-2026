import java.util.Scanner;

public class factorial {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("Enter your Number ");
        int a = sc.nextInt();

        for (int i = a; i > 0 ; i--) {
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
