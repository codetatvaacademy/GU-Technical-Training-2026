import java.util.*;
public class Problem18 {
    //WAP to take input 3 numbers from the user and print the numbers in the descending order
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();  
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt(); 
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Compare the numbers and print them in descending order
        if(num1 >= num2 && num1 >= num3 ){
            if(num2>=num3){
                System.out.println(num1+ " " + num2+ " " + num3);
            } else{
                System.out.println(num1+ " " + num3+" " + num2);
            }
        }else if(num2 >= num1 && num2 >= num3){
            if(num1 >= num3){
                System.out.println(num2+" " + num1+ " "+ num3);
            } else {
                System.out.println(num2+" "+ num3+ " "+ num1);
            }
        } else{
            if(num1>=num2){
                System.out.println(num3 + " " + num1 + " " + num2);
            } else {
                System.out.println(num3 + " " + num2 + " " + num1);
            }
        }  
    }
}
