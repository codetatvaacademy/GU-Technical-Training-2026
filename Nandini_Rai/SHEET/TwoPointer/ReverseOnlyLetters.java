import java.util.Scanner;
public class ReverseOnlyLetters {
        public String reverseOnlyLetters(String s) {
            char s1[] = s.toCharArray();
            int i=0;
            int j=s.length()-1;
            while(i<j){
                if(!Character.isLetter(s1[i]) ){
                    i++;
                    continue;
                }
                if(!Character.isLetter(s1[j])){
                    j--;
                    continue;
                }
                char temp = s1[i];
                s1[i] = s1[j];
                s1[j] = temp;
                i++;
                j--;
            }
            return new String(s1);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            ReverseOnlyLetters rl = new ReverseOnlyLetters();
            System.out.println(rl.reverseOnlyLetters(s));
        }
}
