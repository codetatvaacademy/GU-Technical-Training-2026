public class find_the_heighest_altitude {
    class Solution {
        public int largestAltitude(int[] gain) {
            int maxHeight = gain[0];
            for (int i = 1; i < gain.length; i++) {
                gain[i] += gain[i - 1];
                maxHeight = Math.max(gain[i], maxHeight);
            }
            return maxHeight < 0 ? 0 : maxHeight;
        }
    }
}
