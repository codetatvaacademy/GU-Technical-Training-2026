import java.util.Scanner;

public class PrintDescendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        int largest;
        int secondLargest;
        int smallest;

        if(number1>number2 && number1>number3){
            largest=number1;
            if(number2>number3){
                secondLargest=number2;
                smallest=number3;
            }
            else{
                secondLargest=number3;
                smallest = number2;
            }
        }
        else if(number2>number1 && number2>number3){
            largest = number2;
            if(number1>number3){
                secondLargest=number1;
                smallest= number3;
            }
            else{
                secondLargest=number3;
                smallest=number1;
            }
        }
        else{
            largest = number3;
            if(number2>number1){
                secondLargest=number2;
                smallest=number1;
            }
            else{
                secondLargest=number1;
                smallest=number2;
            }
        }

        System.out.print("Number in descending order: "+largest+", "+secondLargest+", "+smallest);
        sc.close();
    }
}
