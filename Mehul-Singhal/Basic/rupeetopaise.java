
import java.util.Scanner;
public class rupeetopaise{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rupee: ");
        int Rupee = sc.nextInt();
        sc.close();
        int Paise = Rupee*100;
        System.out.println("Rupees is converted into paise " + Rupee + " = " + Paise);

    }
}