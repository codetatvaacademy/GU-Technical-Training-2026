import java.util.Scanner;

public class NumInDecOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second integer: ");
        int num2 = sc.nextInt();
        System.out.println("Enter third integer: ");
        int num3 = sc.nextInt();
        sc.close();
        if(num1>num2 && num1>num3){
            if(num2>num3){
                System.out.println(num1 + ", " + num2 + ", " + num3);
            }
            else{
                System.out.println(num1 + ", " + num3 + ", " + num2);
            }
        }
        else if(num2>num1 && num2>num3){
            if(num1>num3){
                System.out.println(num2 + ", " + num1 + ", " + num3);
            }
            else{
                System.out.println(num2 + ", " + num3 + ", " + num1);
            }
        }
        else{
            if(num1>num2){
                System.out.println(num3 + ", " + num1 + ", " + num2);
            }
            else{
                System.out.println(num3 + ", " + num2 + ", " + num1);
            }
        }
    }
}