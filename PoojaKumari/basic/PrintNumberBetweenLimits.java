// Question 28

import java.util.Scanner;

public class PrintNumberBetweenLimits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter lower limit: ");
        int lowerLimit=sc.nextInt();
        System.out.print("Enter upper limit: ");
        int uperLimit=sc.nextInt();
        for(int i=lowerLimit; i<uperLimit;i++){
            System.out.print(" " +i+ " ");
        }
        sc.close();

    }
    
}
