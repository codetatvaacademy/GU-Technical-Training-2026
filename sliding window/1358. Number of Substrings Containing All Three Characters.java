class Solution {
    public int numberOfSubstrings(String s) {
        int[] arr = { -1, -1, -1 };
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] = i;
            if (arr[0] != -1 && arr[1] != -1 && arr[2] != -1) {
                count += 1 + Math.min(Math.min(arr[0], arr[1]), arr[2]);

            }
        }
        return count;
    }
}