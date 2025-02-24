//WAP to take input rupees from the user and convert it into paise.//
import java.util.Scanner;
public class Conversion {
 public static int rupee(int a){
    int p = a * 100;
    return p;
 }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount of rupees:");
    int a = sc.nextInt();
    System.out.println("The paise holds in the above rupees is:" + rupee(a));
 }   
}
