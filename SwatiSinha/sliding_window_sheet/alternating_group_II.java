class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int start = 0, end = 1;
        int count = 0, ans = 0;
        int l = 1;
        while (end < n) {
            if (colors[end] != colors[(end - 1)]) {
                l++;
                if (l >= k)
                    count++;
            } else {
                start = end;
                l = 1;
            }
            end++;
        }
        ans = count;
        while (end < 2 * n) {
            if (colors[end % n] != colors[(end - 1) % n]) {
                l++;
                if (l >= k)
                    count++;
            } else {
                start = end;
                l = 1;
            }
            end++;
        }
        return count - ans;
    }
}