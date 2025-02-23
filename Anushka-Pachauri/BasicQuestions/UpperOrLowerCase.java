import java.util.*;
public class UpperOrLowerCase{
    static boolean isUpperCase(char ch){
        return Character.isUpperCase(ch);
    }
    static boolean isLowerCase(char ch){
        return Character.isLowerCase(ch);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch=sc.next().charAt(0);
        if(isUpperCase(ch)){
            System.out.println("Character is UpperCase");
        }
        else if(isLowerCase(ch)){
            System.out.println("Character is LowerCase");
        }
    }
}