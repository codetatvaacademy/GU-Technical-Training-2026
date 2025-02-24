package Sorting;

import java.util.Arrays;

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int start = 0;
        int end = tokens.length-1;
        int score = 0;
        int maxScore = 0;
        while(start <= end){
            if(tokens[start] <= power){
                score++;
                power -= tokens[start];
                start++;
                maxScore = Math.max(score, maxScore);
            }
            
            else if(score > 0){
                power += tokens[end];
                score--;
                end--;
            }
            else{
                break;
            }
        }
        return maxScore;
    }
}
