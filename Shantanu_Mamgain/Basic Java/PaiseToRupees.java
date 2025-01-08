import java.util.*;
public class PaiseToRupees {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter paise: ");
        double paise = sc.nextDouble();
        double rupees = paise/100;
        System.out.println("Rupees equivalent to your input paise: "+rupees);
    }
}