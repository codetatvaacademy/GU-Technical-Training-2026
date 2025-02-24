import java.util.*;
public class ToggleCase{
    static char toUpperCase(char ch){
        return Character.toUpperCase(ch);
    }
    static char toLowerCase(char ch){
        return Character.toLowerCase(ch);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch=sc.next().charAt(0);
        if(Character.isUpperCase(ch)){
            System.out.println("Character in Toggle Case: "+toLowerCase(ch));
        }
        else if(Character.isLowerCase(ch)){
            System.out.println("Character in Toggle Case: "+toUpperCase(ch));
        }
    }
}