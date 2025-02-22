import java.util.Scanner;

public class RupeesPiasa {
    public class RupeesToPaise {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter amount ");
            double rupees = scanner.nextDouble();
            int paise = (int) (rupees * 100);
            System.out.println(paise);
            scanner.close();
        }

    }
}
