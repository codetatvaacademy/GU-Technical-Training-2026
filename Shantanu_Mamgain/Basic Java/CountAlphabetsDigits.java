import java.util.Scanner;

public class CountAlphabetsDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any string: ");
        String str = sc.nextLine();
        
        int countAlphabet = 0;
        int countDigit = 0;
        int countSpecial = 0;
        for(int i =0 ; i < str.length(); i++){
            if(str.charAt(i)>='a'&& str.charAt(i)<='z' ||str.charAt(i)>='A'&& str.charAt(i)<='Z'  ){
                countAlphabet ++;
            }
            else if(str.charAt(i)>='1'&& str.charAt(i)<='9'){
                countDigit ++;
            }
            else {
                countSpecial++;
            }
        }

        System.out.print("Total alphabets: "+countAlphabet+", Total digits: "+countDigit+", Total special characters: "+countSpecial);

        sc.close();
    }
}