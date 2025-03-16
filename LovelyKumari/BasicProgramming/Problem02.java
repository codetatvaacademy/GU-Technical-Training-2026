import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number=sc.nextInt();

        //Square calc 
        int Square= number*number ;
        System.out.println("Square of a number = " + Square);

        //cube calc 
        int cube= number*number*number ;
        System.out.println("Cube of a number = " + cube);
    }
    
}
