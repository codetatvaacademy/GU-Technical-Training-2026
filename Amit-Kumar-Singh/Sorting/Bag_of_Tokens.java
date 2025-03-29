class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0;
        int end = tokens.length-1;
        for(int i=0;i<tokens.length;i++){
            if(tokens[i]>power && score>0 && end>i){
                power += tokens[end];
                end--;
                score--;
            }
            if(tokens[i]<=power){
                power -= tokens[i];
                score++;
            }
            //System.out.println(power+" "+score+" "+end);
        }
        return score;
    }
}