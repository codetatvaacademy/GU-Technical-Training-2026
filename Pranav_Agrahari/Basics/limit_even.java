import java.util.Scanner;

public class limit_even {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Lower Limit");
        int a = sc.nextInt();
        System.out.println("Enter your Upper Limit");
        int b = sc.nextInt();
        
        for (int i = a; i <= b; i++) {
          if ( i %2 ==0 ) {
            System.out.print(i + ",");
          }
        }
    }
}
