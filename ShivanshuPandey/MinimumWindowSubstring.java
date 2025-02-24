import java.util.Scanner;
public class MinimumWindowSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main string to find the minimum window substring ");
        String s = sc.next();
        System.out.println("Enter the string target string to find ");
        String t = sc.next();

        // String s = "ADOBECODEBANC";
        // String t = "ABC";
        System.out.println(minWindow(s, t));

    }

        public static String minWindow(String s, String t) {
            int start = 0;
            int end = 0;
            int minLength = s.length()+1;
            int startIndex = -1;
            int unique = 0;
    
            int[] frequencyS = new int[128];
            int[] frequencyT = new int[128];
    
            for(char c : t.toCharArray()){
                if(frequencyT[c]++ == 0)
                    unique++;
            }
    
            while(end < s.length()){
                char c = s.charAt(end);
                frequencyS[c]++;
    
                if(frequencyS[c] == frequencyT[c])
                    unique--;
                
                while(unique == 0){
    
                    if(end - start + 1 < minLength){
                        startIndex = start;
                        minLength = end - start+1;
                    }
    
                    char ch = s.charAt(start);
                    if(frequencyS[ch] == frequencyT[ch])
                        unique++;
                    
                    start++;
                    frequencyS[ch]--;
                }
                end++;
            }
            return startIndex == -1 ? "" : s.substring(startIndex, startIndex+minLength);
        }
    
}
