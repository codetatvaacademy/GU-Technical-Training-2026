public class shifting_letters {
    class Solution {
        public String shiftingLetters(String s, int[] shifts) {
            int n = shifts.length;
    
            for (int i = n - 2; i >= 0; i--) {
                shifts[i] += shifts[i + 1]%26; 
            }
    
            char[] chars = s.toCharArray();
            for (int i = 0; i < n; i++) {
                int shift = shifts[i] ;
                int newChar = (int) (chars[i] - 'a' + shift)%26; 
                chars[i] = (char) ('a' + newChar); 
            }
            return String.valueOf(chars);
        }
    }
}
