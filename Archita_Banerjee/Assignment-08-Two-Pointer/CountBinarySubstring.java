public class CountBinarySubstring {
    public int countBinarySubstrings(String s) {
        int cnt=0;
        int i=1;
        int  prev=0;
        int  curr=1;
        while(i<s.length()){
            if(s.charAt(i-1)!= s.charAt(i)){
                cnt+=Math.min(prev,curr);
                prev=curr;
                curr=1;
            }else{
                curr++;
            }
            i++;
        }
        return cnt+= Math.min(prev, curr);
    }
}
