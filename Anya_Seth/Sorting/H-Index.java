class Solution {
    public int hIndex(int[] citations){
      int[] freq = new int[citations.length + 1];
      for(int i = 0 ; i < citations.length ; i++){
        if(citations[i] > citations.length - 1){
        freq[freq.length - 1]++;  
        }
        else{
        freq[citations[i]]++;
        }
      }
      int[] suffixSum = new int[freq.length];
      suffixSum[suffixSum.length - 1] = freq[freq.length - 1];
      for(int i = suffixSum.length - 2 ; i>=0 ; i--){
        suffixSum[i] = suffixSum[i+1] + freq[i];
      }
      for(int i = suffixSum.length - 1 ; i >= 0 ; i--){
        if(suffixSum[i] >= i){
            return i;
        }
      }
      return 0;
    }
}
