import java.util.*;
public class twosum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int val=0;
       
        for(int i=0;i<nums.length;i++){
               val = target-nums[i];
            if(mp.containsKey(val)){
             return new int[]{mp.get(val),i};
            }
          else{
            mp.put(nums[i],i);
        }
        }
        return new int[]{};
    }
}
