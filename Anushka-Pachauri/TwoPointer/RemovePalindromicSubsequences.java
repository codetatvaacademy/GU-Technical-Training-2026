class Solution {
    public int removePalindromeSub(String s) {
        s=s.trim();
        String reverse=new StringBuilder(s).reverse().toString();
        return s.equals(reverse) ? 1 : 2;
    }
}