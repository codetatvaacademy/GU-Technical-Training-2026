class Solution {
    public int numberOfSubstrings(String s) {
      int start=0;
      int end=0;
      int ans=0;
      int x=0, y=0, z=0;

        while(end<s.length()){
            if(s.charAt(end)=='a')
            x++;
            if(s.charAt(end)=='b')
            y++;
            if(s.charAt(end)=='c')
            z++;
            while(x>0 && y>0 && z>0){
            ans += s.length()-end;
            if(s.charAt(start) == 'a') 
            x--;
            if(s.charAt(start) == 'b') 
            y--;
            if(s.charAt(start) == 'c') 
            z--;
           start++; 
        }
        end++;
        }
        return ans;
    }
}