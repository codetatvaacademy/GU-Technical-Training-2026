import java.util.HashMap;

public class SubstringsAllThreeCharacters {
    public int numberOfSubstrings(String s) {
        char []s1= s.toCharArray();
        HashMap<Character, Integer> mp= new HashMap<>();
        int start=0;
        int end=0;
        int cnt=0;
        while(end < s1.length && start< s1.length){
            mp.put(s1[end], mp.getOrDefault(s1[end],0)+1);
            if(mp.size()< 3){
                end++;
            }else{
                while(mp.size()>=3 && start<=end){
                    cnt+= s1.length-end;
                    mp.put(s1[start], mp.get(s1[start]) - 1);
                    if (mp.get(s1[start]) == 0) {
                        mp.remove(s1[start]);
                    }
                    start++;
                }
                end++;
            }
        }
        return cnt;
    }
}
