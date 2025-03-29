import.java.util.*;

class contsubarrsum {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (k == 0) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == 0 && nums[i + 1] == 0) {
                    return true;
                }
            }
            return false;
        }
        Map<Integer,Integer> mp = new HashMap<>();
         mp.put(0,-1);
        
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
            int rem =sum%k;
            if(rem<0){
                rem=rem+k;
            }
            if(!mp.containsKey(rem)){
                 mp.put(rem,i);
            } 
            else{
             if (i - mp.get(rem) > 1) {
                    return true;
                }
            }
        }
        return false;
    }
} 