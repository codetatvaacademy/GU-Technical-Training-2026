class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int hIndex = -1;
        int target = -1;
        for(int i=0;i<citations.length;i++){
            target = citations[i];
            if(target<= citations.length-i){
                hIndex = target;
            }
            else{
                hIndex = Math.max(hIndex,citations.length-i);
            }
        }
        return hIndex;
    }
}