class Solution {
    public boolean isPalindrome(String s) {
        String sProcessed = s.toLowerCase();
        int end = s.length() - 1;
        int start=0;
        while(start<=end){
            char cf = sProcessed.charAt(start);
            char cl = sProcessed.charAt(end);
            if(!Character.isLetterOrDigit(cf)){
                start++;
            }
            else if(!Character.isLetterOrDigit(cl)){
                end--;
            }
            else{
                if(cf!=cl){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}