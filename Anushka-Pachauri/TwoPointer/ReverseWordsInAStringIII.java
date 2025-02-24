class ReverseWordsInAStringIII {
    public void reverse(char[] words, int start, int end) {
        while (end > start) {
            char ch = words[start];
            words[start] = words[end];
            words[end] = ch;
            end--;
            start++;
        }
    }

    public String reverseWords(String s) {
        char[] words=s.toCharArray();
        int start=0;
        for(int end=0;end<words.length;end++){
            if(words[end]==' '){
                reverse(words,start,end-1);
                start=end+1;
            }
        }
        reverse(words,start,words.length-1);
        return new String(words);
    }
}