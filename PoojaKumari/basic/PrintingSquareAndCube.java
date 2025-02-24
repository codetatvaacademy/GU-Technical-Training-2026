//Question 2
import java.util.*;
public class PrintingSquareAndCube {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int num=sc.nextInt();
    int square=num*num;
    int cube= num*num*num;  
    System.out.println("Square of given number="+square);
    System.out.println("Cube of given number="+cube);
    }

    
}
