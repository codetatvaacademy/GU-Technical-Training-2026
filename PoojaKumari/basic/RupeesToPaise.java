//Question 4
import java.util.Scanner;
public class RupeesToPaise {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter amount in rupees:");
    double rupees=sc.nextDouble();
    int paise=(int)(rupees*100);
    System.out.println("Amount in paise:"+paise);
    sc.close();
    }

    
}
