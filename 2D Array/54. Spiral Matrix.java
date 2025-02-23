class Solution {
    public List<Integer> spiralOrder(int[][] arr)

    {
        int m = arr.length, n = arr[0].length;

        int r1 = 0;
        int c1 = 0;
        int r2 = m - 1;
        int c2 = n - 1;
        List<Integer> answer = new ArrayList<>();

        while (r1 <= r2 && c1 <= c2) {
            for (int c = c1; c <= c2; c++) {
                answer.add(arr[r1][c]);
            }

            for (int r = r1 + 1; r <= r2; r++) {
                answer.add(arr[r][c2]);
            }

            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c >= c1; c--) {
                    answer.add(arr[r2][c]);
                }

                for (int r = r2 - 1; r > r1; r--) {
                    answer.add(arr[r][c1]);
                }
            }

            r1++;
            c1++;
            r2--;
            c2--;
        }

        return answer;

    }
}