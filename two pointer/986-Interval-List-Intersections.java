class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> intersections = new ArrayList<>();
        int i = 0, j = 0;

        while (i < firstList.length && j < secondList.length) {

            int start = Math.max(firstList[i][0], secondList[j][0]);
            int end = Math.min(firstList[i][1], secondList[j][1]);

            if (start <= end)
                intersections.add(new int[] { start, end });

            if (firstList[i][1] < secondList[j][1])
                i += 1;
            else
                j += 1;
        }

        return intersections.toArray(new int[0][]);

    }
}