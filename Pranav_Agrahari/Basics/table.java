import java.util.Scanner;

public class table {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("Enter your Number ");
        int a = sc.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(a + "*"+i+"=" + a*i);
        }
    }
}
