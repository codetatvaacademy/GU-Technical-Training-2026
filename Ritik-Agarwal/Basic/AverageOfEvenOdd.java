import java.util.Scanner;
public class AverageOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oddSum = 0;
        int countEven = 0;
        int evenSum = 0;
        int countOdd = 0;

        while(true){
            int num = sc.nextInt();
            if(num==-1){
                break;
            }
            if(num%2==0){
                evenSum+=num;
                countEven++;
            }
            else{
                oddSum+=num;
                countOdd++;
            }
        }
        sc.close();
        System.out.println("Average of input odd numbers: " + (oddSum/countOdd));
        System.out.println("Average of input even numbers: " + (evenSum/countEven));
    }
}