class Solution {
    public String reverseOnlyLetters(String s) {
        char[] str = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if((str[start]>='a' && str[start]<='z') || (str[start]>='A' && str[start]<='Z')){
                if((str[end]>='a' && str[end]<='z') || (str[end]>='A' && str[end]<='Z')){
                    char temp = str[start];
                    str[start] = str[end];
                    str[end] = temp;
                    start++;
                    end--;
                }
                else{
                    end--;
                }
            }
            else{
                start++;
            }
        }
        return new String(str);
    }
}