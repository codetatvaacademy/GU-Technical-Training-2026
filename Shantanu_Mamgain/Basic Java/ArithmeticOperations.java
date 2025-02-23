import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.println("Enter the operation you want to perform (+ - * /): ");
        char operator = sc.next().charAt(0);

        int sum = number1+number2;

        int difference = number1-number2;
        
        int multiply = number1*number2;

        int division;
        if(number1!=0 && number2!=0){
            division = number1/number2;
        }
        else{
            division = 0;
        }
        

        switch(operator){
            case '+':
                System.out.println(number1+" + "+number2+" = "+sum);
                break;
            case '-':
                System.out.println(number1+" - "+number2+" = "+difference);
                break;
            case '*':
                System.out.println(number1+" * "+number2+" = "+multiply);
                break;
            case '/':
                System.out.println(number1+" / "+number2+" = "+division);
        }
        sc.close();
    }
}