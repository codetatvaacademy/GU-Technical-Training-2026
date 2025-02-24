// Question 25
import java.util.*;

public class checkUpperAndLowerCase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Character: ");
        Character ch=sc.next().charAt(0);
        int Ascii=ch;
        if(Ascii>=41 && Ascii<=90){
            System.out.println( " character " + ch +" is in lowercase.");
        }
        else if(Ascii>=97 && Ascii<=122){
            System.out.println( " character " + ch +" is in Uppercase.");
        }
        sc.close();
    }
    
}
