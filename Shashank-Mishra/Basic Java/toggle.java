import java.util.*;
public class toggle {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter a character which is an alphabet");
        char ch= sc.next().charAt(0);
        if(ch>='a'&& ch<='z')
        {
            ch=Character.toUpperCase(ch);
            System.out.println(ch);
        }
        else if(ch>='A'&&ch<='Z')
        {
            ch=Character.toLowerCase(ch);
            System.out.println(ch);
        }
        
    }
    
}
