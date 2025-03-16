class Solution {
    public void reverse(char[] s1, int start, int end){
        while(start<end){
            char temp=s1[start];
            s1[start]=s1[end];
            s1[end]=temp;
            start++;
            end--;
        }
    }
    public String reverseStr(String s, int k) {
        char[] s1=s.toCharArray();
        int i=0;
        while(i<s1.length){
            if(i+k-1<s1.length){
                reverse(s1,i,i+k-1);
            }
            else{
                reverse(s1,i,s1.length-1);
            }
            i+=2*k;
        }
        return new String(s1);
    }
}