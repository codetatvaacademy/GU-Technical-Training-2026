import java.util.Scanner;

public class largest_3rd_if {
    public static int large(int a , int b , int c){

        if (a>b && a>c) {
            return a;
        }
        if (b>a && b>c) {
            return b;
        }
        else{
            return c;
        }
      //  return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(large(a, b, c));
    }
}
