class Solution {
    public int maxVowels(String s, int k) {
        char[] s1=s.toCharArray();
        int start=0;
        int end=0;
        int vowelCount=0;
        int maxVowel=Integer.MIN_VALUE;
        while(end<s1.length){
            if((s1[end]=='a'||s1[end]=='e'||s1[end]=='i'||s1[end]=='o'||s1[end]=='u')){
                vowelCount++;
            }
            if((end-start+1)==k){
                maxVowel=Math.max(maxVowel,vowelCount);
                if(s1[start]=='a'||s1[start]=='e'||s1[start]=='i'||s1[start]=='o'||s1[start]=='u'){
                    vowelCount--;
                }
                start++;
            }
            end++;
        }
        return maxVowel;
    }
}