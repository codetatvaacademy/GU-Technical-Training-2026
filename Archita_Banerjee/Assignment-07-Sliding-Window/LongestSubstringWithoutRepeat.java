public class LongestSubstringWithoutRepeat {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int maxlen=0;
        int []arr= new int[128];
        for(int end=0;end<s.length();end++){
            char c = s.charAt(end);
            start= Math.max(start,arr[c]);
            maxlen= Math.max(maxlen, end-start+1);
            arr[c]= end+1;
        }
        return maxlen;
    }
}
