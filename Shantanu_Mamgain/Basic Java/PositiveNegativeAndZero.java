
import java.util.*;
public class PositiveNegativeAndZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter a number: ");
        int number =  sc.nextInt();

        if(number>0){
            System.out.println("it is positive number");
        }
        else if(number<0){
            System.out.println("it is negative number");
        }
        else{
            System.out.println("it is zero");
        }

        sc.close();
    }
}
