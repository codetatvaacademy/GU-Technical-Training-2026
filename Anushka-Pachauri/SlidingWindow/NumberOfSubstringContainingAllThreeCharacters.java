class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int[] nextIndex=new int[3];
        Arrays.fill(nextIndex,-1);
        for(int i=0;i<s.length();i++){
            nextIndex[s.charAt(i)-'a']=i;
            if(nextIndex[0]>=0 && nextIndex[1]>=0 && nextIndex[2]>=0){
                count+=Math.min(nextIndex[0],Math.min(nextIndex[1],nextIndex[2]))+1;
            }
        }
        return count;
    }
}