import java.util.Scanner;

public class CheckCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any character: ");
        char character = sc.next().charAt(0);

        if(character>='a' && character<='z' || character>='A' && character<='Z' ){
            System.out.println("it is an alphabet");
        }
        else if(character>='0' && character<='9'){
            System.out.println("it is an digit");
        }
        else{
            System.out.println("it is a special character");
        }
        
        sc.close();
    }
}
