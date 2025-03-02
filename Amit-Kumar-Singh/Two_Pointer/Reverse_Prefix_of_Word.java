class Solution {
    public String reversePrefix(String word, char ch) {
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                return helper(word,i);
            }
        }
        return word;
    }
    private String helper(String word, int idx){
        StringBuilder s = new StringBuilder();
        for(int i=idx;i>=0;i--){
            s.append(word.charAt(i));
        }
        for(int i=idx+1;i<word.length();i++){
            s.append(word.charAt(i));
        }
        return s.toString();
    }
}