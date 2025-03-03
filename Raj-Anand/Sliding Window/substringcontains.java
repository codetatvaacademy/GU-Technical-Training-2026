class substringcontains{
    public int numberOfSubstrings(String s) {
        int start=0;
        int end=0;
        int countA=0;
        int countB=0;
        int countC=0;
        int valid=0;
        while(end<s.length()){
            if(s.charAt(end)=='a'){
                countA++;
            }
            else if(s.charAt(end)=='b'){
                countB++;
            }
            else{
                countC++;
            }
            while(countA>0 && countB>0 && countC>0){
                valid+=s.length()-end;

            
                if (s.charAt(start) == 'a') countA--;
                if (s.charAt(start) == 'b') countB--;
                if (s.charAt(start) == 'c') countC--;
                start++;

            }  
            end++;
    }
    return valid;

    }
}
