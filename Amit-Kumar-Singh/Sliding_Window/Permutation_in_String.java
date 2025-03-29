class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[] occurence = new int[26];
        int[] occurence2 = new int[26];
        for(int i=0;i<s1.length();i++){
            occurence[s1.charAt(i)-'a']++;
            occurence2[s2.charAt(i)-'a']++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(occurence[i]==occurence2[i]){
                count++;
            }
        }

        for(int i =0;i<s2.length() - s1.length();i++){
            int r =s2.charAt(i +s1.length()) - 'a', l=s2.charAt(i) - 'a';
            if(count == 26){
                return true;
            }
            occurence2[r]++;
            if(occurence2[r]==occurence[r]){
                count++;
            }
            else if(occurence2[r]==occurence[r]+1){
                count--;
            }
            occurence2[l]--;
            if(occurence2[l]==occurence[l]){
                count++;
            }
            else if(occurence2[l]==occurence[l]-1){
                count--;
            }
        }
        return count== 26;
    }
}