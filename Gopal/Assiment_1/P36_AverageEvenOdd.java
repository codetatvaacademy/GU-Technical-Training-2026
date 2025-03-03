import java.util.Scanner;

public class P36_AverageEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int check = 0 , number = 0 ;
        while (check != -1) {
            System.out.print("Enter total number : ");
            int num = sc.nextInt();
            int odd = 0 , countOdd = 0 ;

            int even = 0 , countEven = 0 ;
            System.out.print("Enter number : ");
            while (number != num ) {
                int n = sc.nextInt();
                if ( n % 2 == 0 ){
                    even += n ;
                    countEven++;
                }
                else {
                    odd += n ;
                    countOdd++;
                }
                number++;
            }
            System.out.println("Odd Average : " + odd/countOdd);
            System.out.println("Even Average : " + even/countEven);

            System.out.print("To Continue Press any number expect -1 :: ");
            int ch = sc.nextInt();
            number = 0 ;
            check = ch ;
        }
    }
}
