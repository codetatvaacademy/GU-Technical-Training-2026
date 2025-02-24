import java.util.Scanner;
public class CheckSignedInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if(num<0){
            System.out.println("Input number is positive.");
        }
        else if(num>0){
            System.out.println("Input number is negative.");
        }
        else{
            System.out.println("Input number is zero.");
        }
    }
}