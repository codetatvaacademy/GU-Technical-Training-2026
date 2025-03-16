import java.util.Scanner;
class AppendCharacterMakeSubsequence{
        public int appendCharacters(String s, String t) {
            int i=0;
            int j=0;
            if (s.contains(t)) return 0;
            while(i<s.length() && j<t.length()){
                if(s.charAt(i)==t.charAt(j)){
                    j++;
                }
                i++;
            }
            int result = t.length() -j;
            return result;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String t = sc.nextLine();
            AppendCharacterMakeSubsequence ac = new AppendCharacterMakeSubsequence();
            System.out.println(ac.appendCharacters(s, t));
        }
}