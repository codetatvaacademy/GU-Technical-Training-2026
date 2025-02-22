import java.util.*;

public class q14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter rate");
        double rate = s.nextDouble();
        System.out.print("Enter quantity");
        int quantity = s.nextInt();

        double amount = rate * quantity;

        System.out.println("Net amount: " + amount);
        s.close();
    }
}
