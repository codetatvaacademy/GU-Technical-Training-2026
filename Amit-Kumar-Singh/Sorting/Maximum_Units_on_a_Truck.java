class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b)-> Integer.compare(b[1],a[1]));
        int ans = 0;
        for(int i=0;i<boxTypes.length;i++){
            if(truckSize<boxTypes[i][0]){
                ans += truckSize*boxTypes[i][1];
                break;
            }
            ans += boxTypes[i][0]*boxTypes[i][1];
            truckSize -= boxTypes[i][0];
        }
        return ans;
    }
}