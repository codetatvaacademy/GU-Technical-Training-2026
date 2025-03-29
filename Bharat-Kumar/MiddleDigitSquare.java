import java.util.Scanner;

public class MiddleDigitSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        if(digit<100 || digit>999){
            System.out.println("Ivalid");
        }
        int middle = (digit/10)%10;
        int square = middle*middle;
        System.out.println(square);
    }
}
