import java.util.Arrays;

public class PermutationString {
    public boolean checkInclusion(String s1, String s2) {
        int freqS1[]= new int[26];
        int freqS2[]= new int[26];
        for(int i=0;i<s1.length();i++){
            char ch= s1.charAt(i);
            freqS1[ch-'a']++;
        }

        int start=0;
        int end=0;
        while(end<s2.length()){
            char ch= s2.charAt(end);
            freqS2[ch-'a']++;
            if(end-start+1==s1.length()){
                if(Arrays.equals(freqS1,freqS2)){
                    return true;
                }
                char c= s2.charAt(start);
                freqS2[c-'a']--;
                start++;
            }
            end++;
        }
        return false;
    }
}
