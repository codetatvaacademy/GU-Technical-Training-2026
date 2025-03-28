import java.util.*;
class subarraysumdivbyk {
    public int subarraysDivByK(int[] nums, int k) {
        
  
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        int prefixsum=0;
        int count=0;
        int rem=0;
        for(int i=0;i<nums.length;i++){
            prefixsum=prefixsum+nums[i];
             rem= prefixsum%k;
            if(rem<0){
               rem= rem+k;
            }
           if(!mp.containsKey(rem)){
             mp.put(rem,1);
         }
         else{
            count=count+mp.get(rem);
            int freq= mp.get(rem)+1;
            mp.put(rem,freq);
         } 
        }
         return count;
        }
       
    }
