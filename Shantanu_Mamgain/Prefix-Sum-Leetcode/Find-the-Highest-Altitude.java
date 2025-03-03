class Solution {
    public int largestAltitude(int[] gain) {
        int altitude[] = new int [gain.length+1];
        altitude[1]= gain[0];
        for(int i =2;i<altitude.length; i++){
            altitude[i] = altitude[i-1]+gain[i-1];
        }

        int max = Integer.MIN_VALUE;
        for(int i=0;i<altitude.length;i++){
            if(altitude[i]>max){
                max = altitude[i];
            }
        }
        return max;
    }
}
