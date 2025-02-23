public class HighestAltitude {
    public int largestAltitude(int[] gain) {
        int maxA = 0;
        int currAl = 0;

        for (int i = 0; i < gain.length; i++) {
            currAl += gain[i];
            maxA = Math.max(maxA, currAl);
        }

        return maxA;
    }
}
