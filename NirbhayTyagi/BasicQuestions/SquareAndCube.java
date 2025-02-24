import java.util.Scanner;
public class SquareAndCube{
    public static int square(int a){
        int b = a * a;
        return b;
    }
    public static int cube(int a){
        int c = a * a * a;
        return c;
    }    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println("The Square of the Number is:" + square(a));
        System.out.println("The Cube of the Number is:" + cube(a));
    }
}     