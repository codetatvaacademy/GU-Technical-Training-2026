
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters{
    public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int answer = 0;
        int[] arr = new int[128];
        while(end < s.length()){
            char c = s.charAt(end);
            start = Math.max(start, arr[c]);
            answer = Math.max(answer, end-start+1 );
            arr[c] = end+1;
            end++;
        }

        return answer;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        System.out.println("The answer is:" + lengthOfLongestSubstring(s));        
    }
}