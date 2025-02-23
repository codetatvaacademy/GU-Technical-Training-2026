import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Value of a:");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
        int ans= a+b;
        System.out.println("The sum of a and b :" + ans);
    }
}
