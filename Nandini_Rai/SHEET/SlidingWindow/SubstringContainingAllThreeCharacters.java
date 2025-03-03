import java.util.Scanner;
public class SubstringContainingAllThreeCharacters {
        public int numberOfSubstrings(String s) {
            int count=0;
            int hash[] = new int[3];
            int j=0;
            for(int i=0;i<s.length();i++){
                    hash[s.charAt(i)-'a']++;
                    while(hash[0]>0 && hash[1]>0 && hash[2]>0){
                        count+= s.length()-i;
                         hash[s.charAt(j)-'a']--;
                        j++;
                    }
            }
            return count;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        SubstringContainingAllThreeCharacters sa = new SubstringContainingAllThreeCharacters();
        System.out.println(sa.numberOfSubstrings(s)); 
    }
}
