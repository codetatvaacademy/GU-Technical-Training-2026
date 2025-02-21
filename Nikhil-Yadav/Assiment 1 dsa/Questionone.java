import java.util.*;

public class Questionone {
    Scanner sc = new Scanner(System.in);

    public void add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();

        Questionone obj = new Questionone();
        obj.add(a, b);
        sc.close();
    }
}
