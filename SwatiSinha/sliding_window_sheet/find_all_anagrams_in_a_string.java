class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        char[] arrS = s.toCharArray();
        char[] arrP = p.toCharArray();
        int[] freqS = new int[26];
        int[] freqP = new int[26];
        List<Integer> result = new ArrayList<Integer>();
        if (arrS.length < arrP.length) {
            return result;
        }
        for (int i = 0; i < arrP.length; i++) {
            freqS[arrS[i] - 'a']++;
            freqP[arrP[i] - 'a']++;
        }
        if (Arrays.equals(freqP, freqS)) {
            result.add(0);
        }
        int start = 0;
        int end = arrP.length;
        while (end < arrS.length) {
            freqS[arrS[end++] - 'a']++;
            freqS[arrS[start++] - 'a']--;
            if (Arrays.equals(freqP, freqS)) {
                result.add(start);
            }
        }
        return result;
    }
}