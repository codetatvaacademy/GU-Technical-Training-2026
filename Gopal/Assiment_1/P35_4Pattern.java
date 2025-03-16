import java.util.Scanner;

public class P35_4Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        System.out.println((num * num * num) - 1);
    }
}
