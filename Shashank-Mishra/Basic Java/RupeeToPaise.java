import java.util.*;
public class RupeeToPaise {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the rupee you want to convert to paise");
        int n = sc.nextInt();
        int s= n*100;
        System.out.println(s+" Is the amount in paise ");
    }
    
}
