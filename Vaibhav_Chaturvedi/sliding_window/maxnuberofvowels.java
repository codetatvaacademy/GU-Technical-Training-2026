package sliding_window;

class maxnuberofvowels {
    public int maxVowels(String s, int k) {
      char ch[]=s.toCharArray();
       int start=0;
       int vowelscount=0;
       int res=0;
       int ind=0;
       while(start<ch.length){ 
         if(start>=k){
         if(ch[start]=='a'||ch[start]=='e'||ch[start]=='i'||ch[start]=='o'||ch[start]=='u'){
          vowelscount++;
         }
          if(ch[ind]=='a'||ch[ind]=='e'||ch[ind]=='i'||ch[ind]=='o'||ch[ind]=='u'){
          vowelscount--;
          
         }
        
        ind++;
       } 
       else{
       if(ch[start]=='a'||ch[start]=='e'||ch[start]=='i'||ch[start]=='o'||ch[start]=='u'){ 
          vowelscount++;
         }
       }
         res=Math.max(res,vowelscount);
         start++;
       }
       return res; 
    }
}           