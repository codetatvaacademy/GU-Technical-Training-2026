class Solution {
    public String reverseStr(String s, int k) {
        int n = s.length();
        char[] str = s.toCharArray();
        for(int i=0;2*i*k<n;i++){
            int start = 2*i*k;
            int end = 2*i*k+k-1;
            if(end>=n){
                end = n-1;
            }
            while(start<end){
                char temp = str[start];
                str[start] = str[end];
                str[end] = temp;
                start++;
                end--;
            }
        }
        return new String(str);
    }
}