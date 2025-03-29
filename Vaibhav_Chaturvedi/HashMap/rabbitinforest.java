
import java.util.*;
class rabbitinforest {
    public int numRabbits(int[] answers) {
        Map<Integer,Integer> mp = new HashMap<>();
        int ans=0;
        for(int i:answers){
            if(!mp.containsKey(i)){
            mp.put(i,i);
            ans = ans+i+1;
        }
        else{
            if(mp.get(i)>0){
               int cnt=mp.get(i)-1;
              mp.put(i,cnt);
            }
            else if(mp.get(i)==0){
               mp.put(i,i); 
               ans = ans+i+1;
            }
        }

        }
        return ans;
    }
}