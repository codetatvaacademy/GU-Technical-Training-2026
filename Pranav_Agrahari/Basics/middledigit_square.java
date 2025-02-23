import java.util.Scanner;

public class middledigit_square {
    public static int square(int a ){
        int b = a%100;
        int c = b/10;
        return c*c ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number ");
        int a = sc.nextInt();
        System.out.println(square(a));

    }
}