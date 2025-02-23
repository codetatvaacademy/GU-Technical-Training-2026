import java.util.Scanner;

public class Problem20 {
    //WAP to perform arithmetic operations as per user's choice
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose an operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice [1/2/3/4]: ");
        int choice=sc.nextInt();
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();

        double ans=0;

        switch (choice) {
            case 1:
                ans=num1+num2;
                System.out.print("Addition result: " + ans);  
                break;
            case 2:
                ans=num1-num2;
                System.out.print("Subtraction reuslt: " + ans );  
                break;
            case 3:
                ans = num1*num2 ;
                System.out.println("Multiplication result: "+ ans);
                break;
            case 4:
                if(num2 != 0){
                    ans=num1/num2 ;
                    System.out.println("Division result: "+ ans);
                } else{
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break ;
            default:
                System.out.println("Invalid choice! Please select a valid operation..");
                break;
        }
    }
    
}
