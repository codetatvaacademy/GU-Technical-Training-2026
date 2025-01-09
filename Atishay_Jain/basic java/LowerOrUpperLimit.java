package Atishay_Jain;

import java.util.*;

public class LowerOrUpperLimit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the lower limit: ");
        int lower=sc.nextInt();

        System.out.println("Enter the upper limit: ");
        int upper=sc.nextInt();

        System.out.println("Enter the number from lower limit to upper limit: ");
        for(int i=lower;i<=upper;i++){
            System.out.print(i+" ");
        }
    }
}
