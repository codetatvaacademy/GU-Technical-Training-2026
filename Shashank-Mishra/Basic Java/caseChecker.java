import java.util.*;
public class caseChecker{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the character you want to check as lowercase or uppercase");
        char ch =sc.next().charAt(0);
        if(ch>='a'&&ch<='z')
        {
         System.out.println("It is a lowercase character");
        }
        else if(ch>='A'&&ch<='Z')
        {
            System.out.println("it is an Uppercase character");
        }
        else
        {
            System.out.println("wrong");
        }
    }
}
