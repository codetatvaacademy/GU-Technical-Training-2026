import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount in rupees: ");
        double rupees= sc.nextDouble();

        //rupees to paise
        int paise=(int) (rupees*100);
        System.out.println("Amount (in paise) = " + paise);
        
    }
    
}
