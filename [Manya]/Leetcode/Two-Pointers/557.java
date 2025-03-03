class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        for(int i = 0; i < words.length; i++){
            words[i] = reverse(words[i]);
        }
        return String.join(" ", words);
    }
    private String reverse(String word){
        char[] ch = word.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        while(left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }
}