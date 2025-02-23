import java.util.Scanner;

public class descending_order {
    public static void descending(int a , int b, int c){
        if (a > b && b >c) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
     else if (b>a && a>c) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }
       else if (c > b && b>a) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
        else if (a > c && c >b) {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        descending(a, b, c);
    }
}
