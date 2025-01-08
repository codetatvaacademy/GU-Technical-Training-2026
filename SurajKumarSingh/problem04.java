// WAP to take input rupees from the user and convert it into paise.

import java.util.Scanner;
public class problem04 {
    public static double inpaise(float rupee){
        return 100 * rupee;
    }  
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter thr rupee : ");
        int n = sc.nextInt();
        System.out.println("Rupee in paise : " +inpaise(n));
        sc.close();
    }  
}
