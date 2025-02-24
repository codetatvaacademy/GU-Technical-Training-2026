class Solution {
    public int[] diStringMatch(String s) {
        char[] s1=s.toCharArray();
        int[] perm=new int[s1.length+1];
        int idx=0;
        int i=0;
        int j=s1.length;
        while(i<j){
            if(s1[idx]=='I'){
                perm[idx]=i;
                i++;
            }
            else{
                perm[idx]=j;
                j--;
            }
            idx++;
        }
        perm[idx]=i;
        return perm;
    }
}