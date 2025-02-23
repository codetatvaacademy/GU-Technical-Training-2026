import java.util.ArrayList;
import java.util.List;

public class AllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans= new ArrayList<>();
        if(s.length()<p.length()){
            return ans;
        }
        int[] frequencyP= new int[26];
        int [] frequencyS= new int[26];
        for(char ch:p.toCharArray()){
            frequencyP[ch-'a']++;
        }
        int start=0;
        int end=0;
        while(end<s.length()){
            frequencyS[s.charAt(end)-'a']++;
            if(end-start+1>p.length()){
                frequencyS[s.charAt(start)-'a']--;
                start++;
            }
            if(end-start+1==p.length()){
                if(matches(frequencyP, frequencyS)){
                    ans.add(start);
                }
            }
            end++;
        }
        return ans;
    }
    public static boolean matches(int [] freqP, int [] freqS){
        for(int i=0;i<freqP.length;i++){
            if(freqP[i]!= freqS[i]){
                return false;
            }
        }
        return true ;
    }
}
