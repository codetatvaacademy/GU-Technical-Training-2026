class Solution {
    public int removePalindromeSub(String s) {
        if(isPalindrome(s)){
            return 1;
        }
        return 2;
    }
    public boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}