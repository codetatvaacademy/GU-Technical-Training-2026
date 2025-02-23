import java.util.Scanner;

public class Difference_2num {
    public static int diff (int a , int b){
        int c = a-b;
        return c;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first number ");
      int a = sc.nextInt();
      System.out.println("Enter your second number");
      int b = sc.nextInt();
      System.out.println("The difference of given number is " + diff(a, b));
    }
}
