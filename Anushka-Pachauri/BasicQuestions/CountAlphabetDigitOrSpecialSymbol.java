import java.util.*;
public class CountAlphabetDigitOrSpecialSymbol{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        int alphabet=0;
        int digit=0;
        int specialSymbol=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetter(ch))
            alphabet++;
            else if(Character.isDigit(ch))
            digit++;
            else
            specialSymbol++;
        }
        System.out.println("Alphabets: "+alphabet+" \nDigits: "+digit+" \nSpecial Symbol: "+specialSymbol);
    }
}