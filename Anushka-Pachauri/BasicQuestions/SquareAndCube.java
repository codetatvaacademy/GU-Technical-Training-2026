import java.util.*;
class SquareAndCube{
    static int square(int num){
        return num*num;
    }
    static int cube(int num){
        return num*num*num;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        System.out.println("Square of "+num+": "+square(num));
        System.out.println("Cube of "+num+": "+cube(num));
    }
}