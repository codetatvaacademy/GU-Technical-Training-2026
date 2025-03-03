class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = s.length();  
        char[] result = s.toCharArray();  
        long totalShift = 0;  

        for (int i = n - 1; i >= 0; i--) {
            totalShift += shifts[i];  
            totalShift %= 26;  
            
            
            result[i] = (char) ('a' + (result[i] - 'a' + totalShift) % 26);
        }
        
        return new String(result);
    }
}
