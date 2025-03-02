public class DIStringMatch {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int left=0;
        int right=n;
        int[] res=new int[n+1];
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='I'){
                res[i]=left;
                left++;
            }else{
                res[i]=right;
                right--;
            }
        }
        res[n]=left;
        return res;
    }
}
