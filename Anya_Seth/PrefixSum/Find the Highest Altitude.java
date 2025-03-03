class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int highest = 0;
        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            if (highest < sum) {
                highest = sum;
            }
        }
        return highest;
    }
}
