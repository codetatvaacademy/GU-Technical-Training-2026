class Solution {
    public String reversePrefix(String word, char ch) {
        int end = word.indexOf(ch);
        if(end == -1){
            return word;
        }        

        StringBuilder str = new StringBuilder(word.substring(0, end+1));
        str.reverse();
        str.append(word.substring(end + 1));

        return str.toString();
    }
}
