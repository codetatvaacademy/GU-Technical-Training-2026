import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        sc.close();
        int temp = n;
        int rev = 0;
        while(temp!=0){
            rev *= 10;
            rev += temp%10;
            temp/=10;
        }
        System.out.println("Reverse of " + n + " is: " + rev);
    }
}