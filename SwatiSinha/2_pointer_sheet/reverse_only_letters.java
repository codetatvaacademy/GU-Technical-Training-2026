class Solution {
    public void reverse(char[] arr, int start, int end) {
        while (start < end) {
            if (Character.isLetter(arr[start])) {
                if (Character.isLetter(arr[end])) {
                    char temp = arr[start];
                    arr[start++] = arr[end];
                    arr[end--] = temp;
                } else {
                    end--;
                }
            } else {
                start++;
            }
        }
    }

    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        reverse(arr, 0, arr.length - 1);
        return new String(arr);
    }
}