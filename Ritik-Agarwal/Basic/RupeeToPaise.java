import java.util.Scanner;
public class RupeeToPaise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rupee: ");
        int rupee = sc.nextInt();
        sc.close();
        int paise = rupee*100;
        System.out.println("Paise in " + rupee + " are: " + paise);
    }
}