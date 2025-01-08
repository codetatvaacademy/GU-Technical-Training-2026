import java.util.Scanner;

public class AverageOfEvenAndOdd {
    public static void main(String[] args) {
        
        int num;
        int oddSum=0;
        int evenSum =0;
        int countEven =0;
        int countOdd=0;


        while(true){

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            num = sc.nextInt();
            if(num == -1){
                break;
            }

            if(num%2==0){
                evenSum += num;
                countEven ++;
            }
            else{
                oddSum += num;
                countOdd ++;
            }
            sc.close();
        }

        int evenAverage = evenSum/countEven;
        int oddAverage = oddSum/countOdd;
        System.out.println("Even average: "+evenAverage+", Odd average: "+oddAverage);
        

        
        
    }
}
