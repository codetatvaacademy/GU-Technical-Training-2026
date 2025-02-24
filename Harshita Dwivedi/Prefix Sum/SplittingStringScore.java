public class SplittingStringScore {
    public int maxScore(String s) {
        int maxScore = 0;
        int totalOnes = 0;
        int zeroes = 0;
        int ones = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                totalOnes++;
            }
        }

        for (int i = 0; i < s.length() - 1; i++) { 
            if (s.charAt(i) == '0') {
                zeroes++;
            } else {
                ones++;
            }
            
            int score = zeroes + (totalOnes - ones);
            maxScore = Math.max(maxScore, score);
        }

        return maxScore;
    }
}
