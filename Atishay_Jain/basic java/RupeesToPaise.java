package Atishay_Jain;

import java.util.*;

public class RupeesToPaise {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter rupee :" );
        int rupee=sc.nextInt();

        int paisa=100*rupee;
        System.out.println("The amount in paisa: " + paisa);
    }
}
