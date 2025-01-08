import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a+b;
        input.close();
        System.out.println("the sum of two numbers is :"+sum);
    }
}