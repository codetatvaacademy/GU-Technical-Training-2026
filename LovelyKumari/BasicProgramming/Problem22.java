import java.util.Scanner;

public class Problem22 {
    //WAP to input a character from user and check whether it is an alphabets, digits, or special symbols
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch=sc.next().charAt(0);

        // Check if the character is an alphabet, digit, or special symbol

        if(Character.isAlphabetic(ch)){
            System.out.println(ch+" is an Alphabet.");
        } else if(Character.isDigit(ch)){
            System.out.println(ch+" is a Digit.");
        } else {
            System.out.println(ch+" is a Special symbol.");
        }

    }
    
}
