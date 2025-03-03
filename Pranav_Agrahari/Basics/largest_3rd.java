import java.util.Scanner;

public class largest_3rd {
    public static int largest (int a , int b , int c){
        if (a > b ) {
            if (a > c) {
                return a;
            }
        }
        if (b > a) {
            if (b > c) {
                return b;
            }
        }
        if (c > a) {
            if (c > b) {
                return c;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(largest(a, b, c));
    }
}
