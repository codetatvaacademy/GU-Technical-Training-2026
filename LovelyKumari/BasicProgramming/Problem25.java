import java.util.Scanner;

public class Problem25 {
    //WAP to convert a character into its toggle case
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch=sc.next().charAt(0);

        // conversion of character to its toggle case
        if(Character.isAlphabetic(ch)){
            if(Character.isUpperCase(ch)){
                ch=Character.toLowerCase(ch);
            } else if(Character.isLowerCase(ch)){
                ch=Character.toUpperCase(ch);
            } System.out.println("The toggled case of the entered character is: "+ ch);

        } else {
            System.out.println("The entered character is not a letter.");
        }
        
    }
}
