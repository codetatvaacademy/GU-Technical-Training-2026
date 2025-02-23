class Solution {
    public String minWindow(String s, String t) {
  
    //steps:->
    //count the frequency of each element of stringt in arrsyofstring t[128]; uniqe;
    //declare a variable minlength = string.length()+1;
    //declare start and end =-1;
    // two pointer start,end =0;
    //traverse the string s with pointer end;
    //count the frequency of current pointer and store the frequency of s in new array[128];
    //now check the frequency of current cahracter in both array in s and t ;
    //if they math so decrese the no of unique character by 1;
    //if unique charactewr reach to zero that is the valid  cade(now we find min  length end -start +1), update min value ;
    //find the frequency of current pointer with start;
    //check the frequency of character mathch in both array;start increase, uniquecharacter+1;
    //currengt character  frequency --;
    //start++
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        // Step 1: Count the frequency of each character in string `t`
        int[] tFreq = new int[128];
        for (char c : t.toCharArray()) {
            tFreq[c]++;
        }

        // Step 2: Declare required variables
        int[] windowFreq = new int[128];
        int start = 0, end = 0, minLength = s.length() + 1;
        int uniqueChars = t.length(); // Total characters in `t` that need to be matched
        int resultStart = -1; // Starting index of the result substring

        // Step 3: Traverse the string `s` using the `end` pointer
        while (end < s.length()) {
            char endChar = s.charAt(end);
            windowFreq[endChar]++;

            // If the current character is needed and its frequency matches with `tFreq`
            if (tFreq[endChar] > 0 && windowFreq[endChar] <= tFreq[endChar]) {
                uniqueChars--;
            }

            // Step 4: When all characters are matched, try to shrink the window
            while (uniqueChars == 0) {
                // Update the minimum length substring
                if (end - start + 1 < minLength) {
                    minLength = end - start + 1;
                    resultStart = start;
                }

                char startChar = s.charAt(start);
                windowFreq[startChar]--;

                // If the character at the `start` pointer is part of `t` and is now less frequent
                if (tFreq[startChar] > 0 && windowFreq[startChar] < tFreq[startChar]) {
                    uniqueChars++;
                }

                start++; // Shrink the window
            }

            end++; // Expand the window
        }

        // Step 5: Return the result
        return resultStart == -1 ? "" : s.substring(resultStart, resultStart + minLength);
    }
}
