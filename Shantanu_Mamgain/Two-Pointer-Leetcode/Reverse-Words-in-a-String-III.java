class Solution {
    public String reverseWords(String s) {
        int start = 0;
        int end = 0;
        StringBuilder result = new StringBuilder();

        while(end < s.length()){
            if(s.charAt(end) == ' ' ){
                StringBuilder sb = new StringBuilder(s.substring(start,end));
                sb.reverse();
                result.append(sb);

                if(end != s.length()-1){
                    result.append(' ');
                }
                start = end+1;
            }
            if(end == s.length()-1){
                StringBuilder sb = new StringBuilder(s.substring(start,end+1));
                sb.reverse();
                result.append(sb);
            }
            end++;
        }

        return result.toString();
    }
}
