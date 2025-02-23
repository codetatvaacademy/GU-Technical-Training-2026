public class MaxNumVowelsSubstring {
    public int maxVowels(String s, int k) {
        int cnt=0;
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                cnt++;
            }
        }
        int max=cnt;
        int start=0;
        int end=k;
        while(end<s.length()){
            if(s.charAt(end)=='a'||s.charAt(end)=='e'||s.charAt(end)=='i'||s.charAt(end)=='o'||s.charAt(end)=='u'){
                cnt++;
            }
            if(s.charAt(start)=='a'||s.charAt(start)=='e'||s.charAt(start)=='i'||s.charAt(start)=='o'||s.charAt(start)=='u'){
                cnt--;
            }
            max= Math.max(max,cnt);
            start++;
            end++;
        }
        return max;
    }
}
