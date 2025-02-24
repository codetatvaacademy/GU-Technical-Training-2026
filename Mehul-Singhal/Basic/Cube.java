import java.util.Scanner;

public class Cube {
    public static void main(String args[]){
    int num;
    System.out.print("Enter an integer number:\n");
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    System.out.println("Square of " + num +"is:"+Math.pow(num,2));
    System.out.println("Cube of " + num +"is:"+Math.pow(num,3));

}
}