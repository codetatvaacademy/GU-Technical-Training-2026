//Question 27
import java.util.*;
public class ConverCharacterToitsToggleCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Character : ");
        Character ch=sc.next().charAt(0);
        int ascii=ch;
        if(ascii>=65 && ascii<=90){
            int lowercase=ascii+32;
            ch=(char) lowercase;
            //System.out.println(ch);
        }
        else if( ascii>=97 && ascii<=122){ 
            int uppercase=ascii-32;
            ch=(char) uppercase;
        }
        System.out.println(ch);
        sc.close();

            
    }
    
}
