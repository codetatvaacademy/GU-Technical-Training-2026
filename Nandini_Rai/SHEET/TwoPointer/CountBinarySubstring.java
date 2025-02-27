import java.util.Scanner;

public class CountBinarySubstring {
        public int countBinarySubstrings(String s) {
            int prevCount = 0;
            int curCount = 1;
            int result = 0;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    curCount++;
                } else {
                    result += Math.min(prevCount, curCount);
                    prevCount = curCount;
                    curCount = 1;
                }
            }
            
            return result += Math.min(prevCount, curCount);
        }
         public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            CountBinarySubstring cb = new CountBinarySubstring();
            System.out.println(cb.countBinarySubstrings(s));
        }
}
