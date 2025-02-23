class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        char[] s1 = s.toCharArray();
        int[] nearestLeftCandle = new int[s1.length];
        int[] nearestRightCandle = new int[s1.length];
        int[] numberOfPlates = new int[s1.length];
        int[] answer = new int[queries.length];

        int plateCount = 0;
        for (int i = 0; i < numberOfPlates.length; i++) {
            if (s1[i] == '*') {
                plateCount++;
            }
            numberOfPlates[i] = plateCount;
        }
        int lastCandle = -1;
        for (int i = 0; i < nearestLeftCandle.length; i++) {
            if (s1[i] == '|') {
                lastCandle = i;
            }
            nearestLeftCandle[i] = lastCandle;
        }
        lastCandle = -1;
        for (int i = nearestRightCandle.length - 1; i >= 0; i--) {
            if (s1[i] == '|') {
                lastCandle = i;
            }
            nearestRightCandle[i] = lastCandle;
        }

        for (int i = 0; i < queries.length; i++) {
            if(nearestLeftCandle[queries[i][0]]==-1 || nearestRightCandle[queries[i][1]]==-1){
                answer[i]=0;
            }
            else{
                answer[i] = numberOfPlates[nearestRightCandle[queries[i][1]]]
                        - numberOfPlates[nearestLeftCandle[queries[i][0]]];
            }
        }
        return answer;
    }
}