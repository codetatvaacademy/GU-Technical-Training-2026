import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");   
        int num = sc.nextInt();

        int numLength = (int)(1 + Math.log10(num));
        int rev =0;

        for(int i=0 ; i<numLength ; i++){
            int rem = (num % 10);
            rev = (rev*10)+rem ;
            num /= 10;
        }
        
        System.out.println("The reverse of the number is: "+rev);
         

        sc.close();
    }
}