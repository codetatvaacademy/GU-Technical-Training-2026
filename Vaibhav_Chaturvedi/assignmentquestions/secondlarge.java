
import java.util.Scanner;


public class secondlarge {
    public static void main(String[] args) {
        System.out.println("enter first number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c){
           if(b>c){
            System.out.println("number is"+b);
           }
           if(c>b){
            System.out.println("number is"+c);
           }
        }
        if(b>a && b>c){
            if(a>c){
             System.out.println("number is"+b);
            }
            if(c>a){
                System.out.println("number is"+c);
               }
         }
         if(c>a && c>b){
            if(a>b){
             System.out.println("number is"+a);
            }
            if(b>a){
                System.out.println("number is"+b);
               }
         }
    }
}
