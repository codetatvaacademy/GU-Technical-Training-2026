package Atishay_Jain;

import java.util.*;

public class CheckUpperOrLowerCase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the character: ");
        char c=sc.next().charAt(0);
        
        if(c>='A' && c<='Z'){
            System.out.println("It is a uppercase.");
        }
        else{
            System.out.println("It is a lowercase.");
        }
    }
}
