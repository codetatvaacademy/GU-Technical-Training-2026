import java.util.*;
public class Problem4{
    public static int longestSemiRepetitiveSubstring(String s) {
        int maxLength = 1;
        int start = 0;
        int end=1;
        int lastRepeatIndex = -1;
        char[] s1=s.toCharArray();
        while(end < s1.length) {
            if (s1[end] == s1[end - 1]) {
                if (lastRepeatIndex != -1) {
                    start = lastRepeatIndex + 1;
                }
                lastRepeatIndex = end - 1;
            }
            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        }
        
        return maxLength;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(longestSemiRepetitiveSubstring(s));
    }
}
//Time Complexity: O(n)
//Space Complexity: O(1)