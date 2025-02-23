class Solution {
    boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public int maxVowels(String s, int k) {

        int count = 0;
        int maxV = 0;
        int i = 0, j = 0;
        int n = s.length();

        while (j < n) {

            if (isVowel(s.charAt(j))) {
                count++;
            }

            if (j - i + 1 == k) {

                maxV = Math.max(count, maxV);

                if (isVowel(s.charAt(i))) {
                    count--;
                }

                i++;
            }

            j++;
        }

        return maxV;
    }
}
