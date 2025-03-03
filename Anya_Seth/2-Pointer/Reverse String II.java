class Solution {
    public String reverseStr(String s, int k) {
    if (s == null || s.length() == 0 || k == 0) {
        return "";
    }
    int i = 0;
    char[] arr = s.toCharArray();
    while (i < s.length()) {
        int left = i;
        int right = Math.min(i + k - 1, arr.length - 1);
        while (left < right) {
            char ch = arr[left];
            arr[left] = arr[right];
            arr[right] = ch;
            left ++;
            right --;
            }
            i = i + 2 * k;
        }
      return new String(arr);
    }
}
