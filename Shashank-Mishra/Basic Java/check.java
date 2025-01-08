import java.util.*;
public class check {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the character you want to check as alphabet , digit , special symbol");
        char ch =sc.next().charAt(0);
        if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
        {
            System.out.println("it is an alphabet");
        }
        else if(ch>='0'&&ch<='9')
        {
            System.out.println("It is a digit");
        }
        else
        {
            System.out.println("It is a special character");
        }

    }
    
}
