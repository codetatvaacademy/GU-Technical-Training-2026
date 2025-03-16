import java.util.Scanner;

public class Problem23 {
    //WAP to input a character from user and check whether it is uppercase and lowercase.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch=sc.next().charAt(0);

        // // Check if the character is uppercase or lowercase
        if(Character.isUpperCase(ch)){
            System.out.print(ch+" is an uppercase letter.");
        } else if(Character.isLowerCase(ch)){
            System.out.print(ch+" is a lowercase letter.");
        } else{
            System.out.print(ch+" is neither an uppercase letter nor a lowercase letter.");
        }
        
    }
    
}
