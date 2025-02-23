import java.util.Scanner;

public class rate {
    public static int discount (int a){
        if (a > 2000) {
            int b = a-((15*a)/100);
            return b;
        }
        else{
            return a ; 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Rate");
        int a = sc.nextInt();
        System.out.println(discount(a));
    }
}
