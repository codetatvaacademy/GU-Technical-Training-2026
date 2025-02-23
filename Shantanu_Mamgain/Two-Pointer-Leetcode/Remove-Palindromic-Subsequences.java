class Solution {
    public int removePalindromeSub(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        String rev = sb.reverse().toString();
        
        return (rev.equals(s)) ? 1 : 2 ;

    }
}
