class Solution {
    public void reverseString(char[] s) {
        char temp;
        int end=s.length-1;
        for(int i=0;i<s.length/2;i++){
            temp=s[i];
            s[i]=s[end];
            s[end]=temp;
            end--;
        }
    }
}