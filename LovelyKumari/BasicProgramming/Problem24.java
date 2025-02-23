import java.util.Scanner;

public class Problem24 {
    //WAP to check whether a character given by user is a vowel or consonant.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch=sc.next().charAt(0);

        //For easier comparisons
        ch=Character.toLowerCase(ch);

        // Check if the character is a vowel or consonant
        if(ch == 'a' || ch =='e' || ch =='i' || ch=='o' || ch=='u'){
            System.out.println(ch+" is a vowel.");
        } else if(ch >= 'a' && ch <= 'z'){
            System.out.println(ch+" is a consonant.");
        } else{
            System.out.println("Invalid input! Please type a valid alphabet");
        }
        
    }
    
}
