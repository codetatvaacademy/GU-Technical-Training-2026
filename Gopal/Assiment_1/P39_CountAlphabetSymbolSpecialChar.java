import java.util.Scanner;

public class P39_CountAlphabetSymbolSpecialChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter String :: ");
        String str = sc.nextLine();

        int countAlphabet =  0 , countSymbol = 0 , countNumber = 0 ;

        for ( int i = 0 ; i < str.length() ; i++ ) {
            int ch = str.charAt(i) ;
            if ( (ch >= 96 && ch <= 122) || (ch >= 65 && ch <= 91)){
                countAlphabet++;
            }
            else if ( ch >= 47 && ch <= 57) {
                countNumber++;
            }
            else {
                countSymbol++;
            }
        }
        System.out.println("countAlphabet :: " + countAlphabet);
        System.out.println("countNumber :: " + countNumber);
        System.out.println("countSymbol :: " + countSymbol);
    }
}
