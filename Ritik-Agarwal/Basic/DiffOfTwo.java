import java.util.Scanner;
public class DiffOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();
        sc.close();
        int diff = num1-num2;
        if(diff<0){
            diff*=(-1);
        }
        System.out.println("Differnce of " + num1 + " and " + num2 + " is: " + diff);
    }
}