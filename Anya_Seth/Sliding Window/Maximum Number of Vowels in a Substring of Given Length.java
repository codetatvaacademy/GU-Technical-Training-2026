class Solution {
    public int maxVowels(String s, int k) {
       int start = 0;
       int end = 0;
       int max = 0;
       int count = 0;
       while(end < s.length()){
        k--;
        if(s.charAt(end) == 'a' || s.charAt(end) == 'e' ||s.charAt(end) == 'i' || 
        s.charAt(end) == 'o' || s.charAt(end) == 'u'){
            count++;
        }
        while(k < 0 && start < s.length() ){
            if(s.charAt(start) == 'a' || s.charAt(start) == 'e' ||s.charAt(start) == 'i' || 
              s.charAt(start) == 'o' || s.charAt(start) == 'u') {
                count--;
            }
             k++;
            start++;
        }
        
        max = Math.max(max, count);
        
        end++;
       }
       return max;
    }
}
