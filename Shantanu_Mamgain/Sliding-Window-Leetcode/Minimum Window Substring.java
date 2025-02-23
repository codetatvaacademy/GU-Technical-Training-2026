class Solution {
    public String minWindow(String s, String t) {
        int start = 0;
        int end = 0;
        int minLen = s.length()+1;
        int si = -1;
        int ei = -1;
        int count = 0;

        char s1[] = new char [128];
        char t1[] = new char [128];

        for(int i = 0; i < t.length(); i++){
            t1[t.charAt(i)] += 1;
            if(t1[t.charAt(i)] == 1){
                count ++;
            }
        }
        while(end < s.length()){
            char c=s.charAt(end);
            s1[c]++;
            if(s1[c] == t1[c]){
                count --;
            }
            while(count == 0){
                if(minLen > end - start + 1){
                    minLen = end-start+1;
                    si = start;
                    ei = end;
                }
                char ch=s.charAt(start);
                if(s1[ch] == t1[ch]){
                    count++;
                }
                s1[ch] --;
                start ++;
            }
            end ++;
        }

        if(si==-1){
            return "";
        }
        else{
            return s.substring(si,si+minLen);
        }
    }
}
