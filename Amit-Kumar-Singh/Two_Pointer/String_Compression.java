class Solution {
    public int compress(char[] chars) {
        int start = 0;
        int idx = 0;
        int n = chars.length;
        while(start<n){
            int groupL = 1;
            while(start+groupL<n && chars[start+groupL]==chars[start]){
                groupL++;
            }
            chars[idx++] = chars[start];
            if(groupL>1){
                for(char c: Integer.toString(groupL).toCharArray()){
                    chars[idx++] = c;
                }
            }
            start += groupL;
        }
        return idx;
    }
}