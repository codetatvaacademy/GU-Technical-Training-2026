import java .util.*;
public class secondLargest {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the first number ");
        int number1 =sc.nextInt();
        System.out.println("Enter the Second number");
        int number2 = sc.nextInt();
        System.out.println("Enter the third number ");
        int number3 = sc.nextInt();

        if(number1>number2 && number1<number3)
        {
          System.out.println("Second largest number is "+number1);
        }
        else if (number2>number1 && number2<number3)
        {
            System.out.println("Second largest number is "+number2);
        }
        else
        {
            System.out.println("Second largest number is "+number3);
        }
    }
    
}
