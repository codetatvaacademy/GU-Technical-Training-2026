class Solution {
    public int maxVowels(String s, int k) {
        char [] c = s.toCharArray();
        int start = 0;
        int end = 0;
        int count = 0;
        int maxVow = 0;
        while(end<c.length){
            if(end-start+1<=k){
                if(isVowel(c[end])){
                    count++;
                    if(maxVow<count){
                        maxVow=count;
                    }
                }
                end++;
            }
            else if(isVowel(c[start])){
                count--;
                start++;
            }
            else{
                start++;
            }
        }
        return maxVow;
    }
    public boolean isVowel(char c){
        if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }
}