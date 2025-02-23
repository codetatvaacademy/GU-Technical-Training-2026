class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int answer = 0;
        int count = 0;
        int n = colors.length;
        for (int i = 1; i < 2 * n - 1; i++) {
            if (i == n - 1) {
                count = answer;
            }
            if (colors[i % n] != colors[(i - 1) % n] && colors[i % n] != colors[(i + 1) % n]
                    && colors[(i - 1) % n] == colors[(i + 1) % n]) {
                answer++;
            }
        }
        return answer - count;
    }
}