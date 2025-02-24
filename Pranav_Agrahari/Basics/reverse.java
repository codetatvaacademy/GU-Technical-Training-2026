import java.util.Scanner;

public class reverse {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int x = sc.nextInt();
        int rev = 0;
        while (x!= 0) {
            int re = x%10 ;
            rev = rev*10+re;
            x=x/10;
          //  System.out.println(rev);
        }
     //   int rev2=rev;
     System.out.println(rev);
    }
}
