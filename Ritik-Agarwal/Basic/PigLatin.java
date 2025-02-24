import java.util.Scanner;
public class PigLatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.next();
        sc.close();
        String pLatin = "";
        if(isVowel(str.charAt(0))){
            pLatin+=str+"yay";
        }
        else{
            int idx = 1;
            for(int i=0; i<str.length(); i++){
                if(isVowel(str.charAt(i))){
                    idx=i;
                }
            }
            for(int i=idx; i<str.length(); i++){
                pLatin+=Character.toString(str.charAt(i));
            }
            for(int i=0; i<idx; i++){
                pLatin+=Character.toString(str.charAt(i));
            }
            pLatin+="ay";
        }
        System.out.println("Pig Latin of " + str + " is: " + pLatin);

    }
    private static boolean isVowel(char ch){
        if(ch>=65 && ch<=90){
            ch = (char) (ch + 32);
        }
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        else{
            return false;
        }
    }
}