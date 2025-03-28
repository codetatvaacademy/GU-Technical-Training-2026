import java.util.*;
public class containduplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
     
     Set <Integer> set = new HashSet <> ();

       for(int right = 0;right<n;right++){
                if(set.size()>k){
                 set.remove(nums[left]);
                 left++;
                }
                if(set.contains(nums[right])){
                    return true;
                }
                set.add(nums[right]);
       }
       return false;
    } 
}
