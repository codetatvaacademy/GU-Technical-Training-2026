import java.util.Scanner;

public class ReverseVowelsString {
        public boolean isVowels(char ch) {
            return ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i' || ch == 'A' || ch == 'E' || ch == 'O'
                    || ch == 'U' || ch == 'I';
        }
    
        public String reverseVowels(String s) {
            char s1[] = s.toCharArray();
            int i = 0;
            int j = s1.length - 1;
            while (i < j) {
                while (i<j && !isVowels(s1[i])) {
                    i++;
                    if(isVowels(s1[i]))
                    break;
                }
    
                while ( i<j && !isVowels(s1[j])) {
                    j--;
                   
                }
                if(i<j){
                char temp = s1[i];
                s1[i] = s1[j];
                s1[j] = temp;
                i++;
                j--;
                }
            }
            return new String(s1);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            ReverseVowelsString rv = new ReverseVowelsString();
            System.out.println(rv.reverseVowels(s));
        }
}
