class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {

        int answer = 0;
        int count = 0;
        int length = colors.length;

        for (int i = 1, start = 0; i < 2 * length - 1; i++) {
            if (i == length - 1) {
                count = answer;
            }
            if (colors[i % length] == 1 && colors[(i - 1) % length] == 0) {
                if (i - start + 1 >= k) {
                    ++answer;
                }
            }
            else if (colors[i % length] == 0 && colors[(i - 1) % length] == 1) {
                if (i - start + 1 >= k) {
                    ++answer;
                }
            }
            else {
                start = i;
            }
        }

        return answer - count;
    }
}