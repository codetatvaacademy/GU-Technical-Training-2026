
class customsortstring {
    public String customSortString(String order, String s) {
        
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            freq[ch-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int j=0;j<order.length();j++){
            char a= order.charAt(j);
            while(freq[a-'a'] >0){
               sb.append(a);
               freq[a-'a']--;
            }
        }
        for(int i=0;i<26;i++){
        
             while(freq[i] >0){
                sb.append((char) (i + 'a'));
               freq[i]--;
            }
        }
        
        return sb.toString();
    }
}