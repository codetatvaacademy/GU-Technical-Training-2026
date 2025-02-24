import java.util.Scanner;

public class secondlargest {
    public static int  large (int a , int b , int c){
        if (a<c && a>b) {
            System.out.println("a is second largest");
            
        }
        else if (b<c && b>a) {
            System.out.println("b is second largest");
        }
        else{
            System.out.println("c is second largest");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int a = sc.nextInt();
        System.out.println("Enter Number 2");
        int b = sc.nextInt();
        System.out.println("Enter Number 3");
        int c = sc.nextInt();
        large(a, b, c);
    }
}
