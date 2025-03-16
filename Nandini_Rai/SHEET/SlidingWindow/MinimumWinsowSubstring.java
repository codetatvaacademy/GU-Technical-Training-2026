import java.util.Scanner;
public class MinimumWinsowSubstring {
        public String minWindow(String s, String t) {
            int start=0;
            int end=0;
            int startIndex =-1;
            int unique=0;
            int minLength = s.length();
            int frequencyS[] = new int[128];
            int frequencyT[] = new int[128];
            for(char ch:t.toCharArray() ){
               if(frequencyT[ch]==0){
                unique++;   //O(t)
               }
               frequencyT[ch]++;
           }
            while(end<s.length()){
                char c = s.charAt(end);
                frequencyS[c]++;
                if(frequencyS[c]==frequencyT[c]){
                    unique--;
                }
                while(unique==0){
                 if(end-start+1<=minLength){
                    startIndex = start;
                    minLength = end-start+1;
                 }
                 char ch = s.charAt(start);
                 if(frequencyS[ch]==frequencyT[ch]){
                    unique++;
                 }
                 start++;
                 frequencyS[ch]--;
                }
                end++;
            }
            return startIndex == -1 ? "" : s.substring(startIndex,startIndex+minLength);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String t = sc.nextLine();
            MinimumWinsowSubstring mw = new MinimumWinsowSubstring();
            System.out.println(mw.minWindow(s, t));
        }
}
