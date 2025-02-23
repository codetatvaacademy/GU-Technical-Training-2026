import java.util.*;
public class Problem2 {
    public static int longestBeautifulSubstring(String s) {
        int maxLength = 0, unique = 1, length = 1;
        char[] s1=s.toCharArray();
        for (int i=1; i<s1.length; i++) {
            if (s1[i] >= s1[i - 1]) {
                length++;
                if (s1[i] > s1[i - 1]) {
                    unique++;
                }
            } 
            else{
                unique = 1;
                length = 1;
            }
            if(unique == 5){
                maxLength = Math.max(maxLength, length);
            }
        }
        
        return maxLength;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(longestBeautifulSubstring(s));
    }
}
//Time Complexity: O(n)
//Space Complexity: O(1)