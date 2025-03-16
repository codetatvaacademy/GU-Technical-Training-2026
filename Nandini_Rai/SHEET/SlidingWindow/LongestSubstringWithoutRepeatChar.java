import java.util.Scanner;
class LongestSubstringWithoutRepeatChar{
        public int lengthOfLongestSubstring(String s) {
            int a[] = new int[128];
            int start = 0;
            int end = 0;
            int maxLength = 0;
            while(end <s.length()){
                int pos = s.charAt(end);
                start = Math.max(start,a[pos]);
                maxLength = Math.max(maxLength,end-start+1);
               a[pos] = end+1;
                end++;
            }
            return maxLength;
        }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        LongestSubstringWithoutRepeatChar ls = new LongestSubstringWithoutRepeatChar();
        int result = ls.lengthOfLongestSubstring(s);
        System.out.println(result);
      }
}