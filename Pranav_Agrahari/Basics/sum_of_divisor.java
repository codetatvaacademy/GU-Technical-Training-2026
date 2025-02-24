import java.util.Scanner;

public class sum_of_divisor {
    public static void main(String[] args) {
        int sod=0;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your Number ");
        int a  = sc.nextInt();

        for (int i = 1; i <=a; i++) {
            if (a%i == 0) {
                sod+=i ;
            }
        }
        System.out.println("The Sum Of The Divisor is " + sod);
    }
}
