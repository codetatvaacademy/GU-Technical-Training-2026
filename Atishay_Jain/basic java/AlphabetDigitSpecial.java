package Atishay_Jain;

import java.util.*;

public class AlphabetDigitSpecial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter alphabet, digit or special character ");
        char c=sc.next().charAt(0);
        
        if(c>='a' && c<='z' || c>='A' && c<='Z'){
            System.out.print("It is a character.");
        }
        else if(c>='0' &&  c<='9'){
            System.out.print("It is a digit.");
        }
        else{
            System.out.print("It is a special character");
        }
    }
}
