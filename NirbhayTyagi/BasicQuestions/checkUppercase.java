
import java.util.Scanner;
 class checkUppercase{
    public static String checkCharacter(char ch){
        if(Character.isUpperCase(ch)){
            return ch + " is an Uppercase.";
        }else{
            return ch + " is an LowerCase.";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println(checkCharacter(ch));
    }
 }