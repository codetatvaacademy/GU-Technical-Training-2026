import java.util.*;
class majorityele2 {
    public List<Integer> majorityElement(int[] nums) {
        
        Map<Integer, Integer> mp = new HashMap<>();
        int n = nums.length / 3;
        ArrayList<Integer> result = new ArrayList<>();

   
        for (int i : nums) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > n) {
                result.add(entry.getKey());
            }
        }

        return result;
    }
}  