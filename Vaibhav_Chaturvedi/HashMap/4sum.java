
class 4sum {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
       int count=0;
       int sum=0;
       int sumreq=0;
       Map<Integer,Integer> mp = new HashMap<>();
      for(int i=0;i<nums3.length;i++){
        for(int j=0;j<nums4.length;j++){
            sumreq =nums3[i]+nums4[j];
            // if(!mp.containsKey(sumreq)){
            // mp.put(sumreq,1);
            mp.put(sumreq,mp.getOrDefault(sumreq,0)+1);
        }
        // else{
        //     int freq=mp.get(sumreq)+1;
        //     mp.put(sumreq,freq);
        // }
        }
        
       for(int i=0;i<nums1.length;i++){
        for(int j=0;j<nums2.length;j++){
            sum = 0-(nums1[i]+nums2[j]);
            if(mp.containsKey(sum)){
                count=count+mp.get(sum);
                
            }
        }
       } 
       return count;
    }
} 