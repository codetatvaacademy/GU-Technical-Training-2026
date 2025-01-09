import java.util.Scanner;

public class CheckVowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        char character = sc.next().charAt(0);

        if(character=='a' || character=='e' || character=='i' || character =='o' || character=='u'|| character=='A' || character=='E' || character=='I' || character =='O' || character=='U'){
            System.out.println("it is a vowel");
        }
        else if(character>='A' && character<='Z' || character>='a' && character<='z'  ){
            System.out.println("It is a consonant");
        }
        else{
            System.out.println("invalid input");
        }
        sc.close();
    }
}
