import java.util.Scanner;

public class ReversePrefixOfWords {
        public String reversePrefix(String word, char ch) {
            char word1[] = word.toCharArray(); 
            int e =-1;
            for(int i=0;i<word1.length;i++){
                if(word1[i]==ch){
                   e=i;
                   break;
                }
            }
            if (e==-1)
            return word;
            int s=0;
            while(s<e){
                char temp = word1[s];
                word1[s] = word1[e];
                word1[e] = temp;
                s++;
                e--;
            }
            return new String(word1);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String word = sc.next();
            char c = sc.next().charAt(0);
            ReversePrefixOfWords pw = new ReversePrefixOfWords();
            System.out.println(pw.reversePrefix(word, c));
        }
}
