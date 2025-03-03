class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = shifts.length;
        for(int i=n-2;i>=0;i--){
            shifts[i] = (shifts[i]+shifts[i+1])%26;
        }
        StringBuilder str = new StringBuilder();
        for(int i=0;i<n;i++){
            int val = s.charAt(i)-'a';
            char c = (char)((val+shifts[i])%26+97);
            str.append(c);
        }
        return str.toString();
    }
}