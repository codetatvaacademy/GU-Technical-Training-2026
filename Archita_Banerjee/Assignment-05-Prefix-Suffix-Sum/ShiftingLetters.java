public class ShiftingLetters {
    public String shiftingLetters(String s, int[] shifts) {
        int n=shifts.length;
        char ans[]= s.toCharArray();
        int ts=0;
        for(int i=n-1;i>=0;i--){
            ts += shifts[i];
            ts %=26;
            ans[i]= (char)((ans[i]-'a' + ts)%26 + 'a');
        }
        return new String(ans);
    }
}
