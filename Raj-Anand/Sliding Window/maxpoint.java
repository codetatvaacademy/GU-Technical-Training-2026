class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        for(int i=0;i<cardPoints.length;i++){
            sum+=cardPoints[i];
            
        }
        int size=cardPoints.length-k;
        int currentsize=0;


        for(int i=0;i<size;i++){
            currentsize+=cardPoints[i];
        }
        int min=currentsize;
        for(int i=size;i<cardPoints.length;i++){
            currentsize+=cardPoints[i];
            currentsize-=cardPoints[i-size];
            min=Math.min(min,currentsize);

        }
        return sum-min;


        
    }
}
