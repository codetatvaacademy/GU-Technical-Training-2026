import java.util.*;

class intersecof2arr {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Map<Integer,Integer> mp1 = new HashMap<>();

        for(int i:nums1){
            if(!mp1.containsKey(i)){
            mp1.put(i,1);
        }
        else{
            int freq= mp1.get(i)+1;
             mp1.put(i,freq);
        }
        }
        ArrayList<Integer> al = new ArrayList<>();
         for(int j:nums2){
            if(mp1.containsKey(j)){
                if(mp1.get(j)>0){
                     al.add(j);
                     int freq= mp1.get(j)-1;
                     mp1.put(j,freq);
                }
            }
        }

  int [] result = new int[al.size()];
 for(int i=0;i<al.size();i++){
    result[i]=al.get(i);
 }
return result;
    }
}