import java.util.* ;
public class Problem08 {
    //WAP to take input 4 digit numbers from the user and print its all digits.
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a 4-digit number :");
        int num=sc.nextInt();

        //Valid or not ?
        if (num >= 1000 && num<=9999){
            int firstDigit=num/1000 ;
            int secondDigit= (num/100) % 10 ;
            int thirdDigit = (num/10) % 10 ;
            int fourthDigit = num % 10 ;

            // Displaying all it's digits 
            System.out.println("The digits of the number are: ");
            System.out.println("First digit: " + firstDigit);
            System.out.println("Second digit: " + secondDigit);
            System.out.println("Third digit: " + thirdDigit);
            System.out.println("Fourth digit: " + fourthDigit);
        } else {
            System.out.println("Enter a valid 4-digit number.");
        }

        
    }
    
}
