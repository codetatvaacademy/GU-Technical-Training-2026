package sliding_window;
import java.util.*;
public class maxerasure  { 
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        int start = 0, n = nums.length, sum = 0, answer = -1;
        
        for(int end = 0; end < n; end++) {
           
            if(set.contains(nums[end])) {
                while(set.contains(nums[end])) {
                    sum -= nums[start];
                    set.remove(nums[start]);
                    start++;
                }
            } 
            
            set.add(nums[end]);
            sum += nums[end];
                 answer = Math.max(answer, sum);
        }
        
        return answer;
    }
}   
 
