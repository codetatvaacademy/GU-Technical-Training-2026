import java.util.*;
public class PrintDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a four digit number: ");
        int number = sc.nextInt();
        
        for(int i=1 ; i<=4 ; i++){
            int lastDigit= number%10;
            System.out.println(i+". "+lastDigit);
            int prefixDigits= number/10;
            number = prefixDigits;
        }

        sc.close();
    }
}
