import java.util.*;
public class arithmatic {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter any one among (+,-,/,*)");
        char ch = sc.next().charAt(0);
        System.out.println("Enter value of A and B ");
        int a=sc.nextInt();
        int b = sc.nextInt();
        switch(ch)
        {
            case '+': System.out.println(a+b);
                      break;
            case '-': System.out.println(a-b);
                      break;
            case '*':System.out.println(a*b);
                     break;
            case '/':System.out.println(a/b);
                     break;
            default : System.out.println("Invalid");

        }
    }
    
}
