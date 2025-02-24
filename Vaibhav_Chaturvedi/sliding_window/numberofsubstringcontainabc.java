package sliding_window;
  
    class numberofsubstringcontainabc {
        public int numberOfSubstrings(String s) {
            
            int counta=0;
            int countb=0;
            int countc=0;
            int count=0;
            int start=0;
            int end=0;
            while(end<s.length()){
                if(s.charAt(end)=='a'){
                    counta++;
                }
                if(s.charAt(end)=='b'){
                    countb++;
                }
                if(s.charAt(end)=='c'){
                    countc++;
                }
                int val = Math.min(counta,Math.min(countb,countc));
                if(val>0){
                  count=count+s.length()-(end+1)+1;
                }
                while(val>0){
                    if(s.charAt(start)=='a'){
                    counta--;
                }
                if(s.charAt(start)=='b'){
                    countb--;
                }
                if(s.charAt(start)=='c'){
                    countc--;
                }
                val = Math.min(counta,Math.min(countb,countc));
    
                if(val>0){
                  count=count+s.length()-(end+1)+1;
                }
                start++;
                }
                
                end++;
            }
            return count;
        }
    } 
    