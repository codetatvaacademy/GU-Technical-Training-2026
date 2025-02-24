import java.util.Scanner;

public class Problem15 {
    //WAP to take input 3 numbers and print the 2nd largest number among them.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        int largest ;
        int secondLargest ;
        
        //Find second largest
        if(num1>num2 && num1>num3){
            largest=num1 ;
            secondLargest =(num2>num3) ? num2 : num3 ;

        } else if( num2 > num1 && num2 > num3){
            largest=num2 ;
            secondLargest=(num1>num3) ? num1 : num3 ;
        } else {
            largest = num3 ;
            secondLargest =(num1>num2) ? num1 : num2 ;
        }
        System.out.println("The second largest number = " + secondLargest);

    }
    
}
