import java.util.*;
public class descending {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the first number");
        int number1=sc.nextInt();
        System.out.println("Enter the second number ");
        int number2=sc.nextInt();
        System.out.println("Enter the third number ");
        int number3=sc.nextInt();

        if(number1>number2&&number2>number3)
        {
            System.out.println(number1 +" " + number2+" " +number3);
        }
        else if (number2>number1&&number1>number3) 
        {
            System.out.println(number2+" "+number1+" "+number3);
        }
        else if(number3>number1&&number1>number2)
        {
            System.out.println(number3+" " + number1+" "+number2);
        }
        else if(number3>number2&&number2>number1)
        {
            System.out.println(number3+" "+number2+" "+number1);
        }
        else if(number1>number3&&number3>number2)
        {
            System.out.println(number1+" " +number3+" " +number2);
        }
        else if (number2>number3&&number3>number1) 
        {
            System.out.println(number2+" "+number3+" "+number1);
        }
    }
    
}
