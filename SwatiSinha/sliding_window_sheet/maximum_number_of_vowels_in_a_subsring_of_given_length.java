class Solution {
    public int maxVowels(String s, int k) {
        int mv = 0;
        int vowel = 0;
        char[] arr = s.toCharArray();
        int n = arr.length;

        for(int i=0; i<n; i++){
            if (isvowel(arr[i])==true){
                vowel+=1;
            }
            if(i>=k){
                if (isvowel(arr[i-k])==true){
                    vowel-=1;
                }
            }
            mv = Math.max(mv, vowel);
        }
        return mv;
    }
    public boolean isvowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}