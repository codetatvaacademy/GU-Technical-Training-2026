class Solution {
    public String reverseWords(String s) {
        int start = 0;
        int end = 0;
        StringBuilder str = new StringBuilder();
        for(int i=0;i<=s.length();i++){
            if(i==s.length() || s.charAt(i)==' '){
                end = i-1;
                while(end>=start){
                    str.append(s.charAt(end));
                    end--;
                }
                if(i!=s.length()){
                    str.append(' ');
                }
                start = i+1;
            }
        }
        return str.toString();
    }
}