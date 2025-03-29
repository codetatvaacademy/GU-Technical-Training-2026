import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> st1 = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            st1.add(nums1[i]);
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int j=0;j<nums2.length;j++){
           if(st1.contains(nums2[j])){
            al.add(nums2[j]);
            st1.remove(nums2[j]);
           }
        } 
        int [] result = new int[al.size()];
 for(int i=0;i<al.size();i++){
    result[i]=al.get(i);
 }

return result;
   }
}