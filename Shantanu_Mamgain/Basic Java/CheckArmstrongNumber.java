import java.util.Scanner;

public class CheckArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int dupicateNumber = number;

        int numLength = (int)(1+Math.log10(number));
        int armstrong = 0;
        for(int i=0; i<numLength ; i++ ){
            int remainder = number % 10;
            armstrong += (int)Math.pow(remainder,3);
            number /= 10;
        }

        if (dupicateNumber == armstrong){
            System.out.println("It is armstrong number.");
        }
        else{
            System.out.println("It is not an armstrong number ");
        }
        sc.close();
    }
}
