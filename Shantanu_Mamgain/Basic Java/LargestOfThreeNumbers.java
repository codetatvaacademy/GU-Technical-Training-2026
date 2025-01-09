import java.util.Scanner;
public class LargestOfThreeNumbers {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();


        //using nested loop
        /*if(number1>number2){
            if(number1>number3){
                System.out.println(number1+" is greatest ");
            }
            else{
                System.out.println(number3+" is greatest");
            }
            
        }
        else if(number2>number3){
            if(number2>number1){
                System.out.println(number2+" is greatest ");
            }
            else{
                System.out.println(number1+" is greatest");
            }
        }
        else{
            System.out.println(number3+" is greatest");
        }
        */
        
        //using and operator

        if(number1>number2 && number2>number3){
            System.out.println(number1+" is greatest");
        }
        else if(number2>number1 && number1>number3){
            System.out.println(number2+" is greatest");
        }
        else{
            System.out.println(number3+" is greatest");
        }

        sc.close();
    }   
    
}



