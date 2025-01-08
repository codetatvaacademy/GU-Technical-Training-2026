import java.util.Scanner;

public class alphabetcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='z')){
            System.out.println("Alphabet");
            
        }
        else if(ch>='1' && ch<='9'){
            System.out.println("digits");
        }
        else
        System.out.println("special character");
    }
}
