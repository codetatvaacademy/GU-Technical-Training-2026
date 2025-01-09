package Atishay_Jain;

import java.util.*;

public class Factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a nummber: ");
        int num=sc.nextInt();

        long factorial=1;

        for(int i=1;i<=num;i++){
            factorial *=i;
        }
        System.out.println("Factorial of a "+num+" is: "+factorial);
    }
}
