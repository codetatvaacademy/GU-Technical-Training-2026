class ShiftingLetters {
    public String shiftingLetters(String s, int[] shifts) {
        shifts[shifts.length-1]%=26;
        for(int i=shifts.length-2;i>=0;i--){
            shifts[i]=(shifts[i+1]+shifts[i])%26;
        }
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            int aVal=(int)'a';
            ch[i]=(char)(((((int)ch[i]-aVal)+shifts[i])%26)+aVal);
        }
        return new String(ch);
    }
}