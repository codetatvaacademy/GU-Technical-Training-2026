class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude=0;
        for(int i=1;i<gain.length;i++){
            gain[i]+=gain[i-1];
        }
        for(int i=0;i<gain.length;i++){
            maxAltitude=Math.max(maxAltitude,gain[i]);
        }
        return maxAltitude;
    }
}