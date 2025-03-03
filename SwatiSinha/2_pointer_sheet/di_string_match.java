class Solution {
    public int[] diStringMatch(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length;
        int[] count = new int[end + 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'I') {
                count[i] = start++;
            } else {
                count[i] = end--;
            }
        }
        count[arr.length] = start;
        return count;
    }
}