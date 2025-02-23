class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if(index == -1){
            return word;
        }
        char[] ans = word.toCharArray();

        int start = 0;
        int end = index;

        while(start < end){
            char temp = ans[start];
            ans[start] = ans[end];
            ans[end] = temp;
            start++;
            end--;
        }
        return new String(ans);
    }
}