// Question 39
import java.util.Scanner;
public class CountCharactersInString {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter String:");
         String str=sc.nextLine();
         int character=0;
         int digit=0;
         int symbol=0;
         for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
         if(Character.isAlphabetic(ch)){
            character++;
         }
         else if(Character.isDigit(ch)){
            digit++;
         }
         else{
            symbol++;
         }
         }
         System.out.println("No. of characters :"+character);
         System.out.println("No. of digit :"+digit);
         System.out.println("No. of :"+symbol);

         sc.close();
    }
}
