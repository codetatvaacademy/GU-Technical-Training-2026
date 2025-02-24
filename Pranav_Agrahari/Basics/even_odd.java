import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int a = sc.nextInt();

        if (a %2 == 0) {
            System.out.println("Even ");
        }
        else if (a ==0){
            System.out.println("You have entered zero");
        }
        else{
            System.out.println("Odd ");
        }
    }
}
