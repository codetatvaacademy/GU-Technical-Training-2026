class Solution {
    Random random;
    int[] prefix;
    int totalWeight;
    public Solution(int[] w) {
        random = new Random();
        int n = w.length;
        prefix = new int[n];
        for(int i=0;i<n;i++){
            totalWeight += w[i];
            prefix[i] = totalWeight;
        }
    }
    
    public int pickIndex() {
        int n = prefix.length;
        int idx = random.nextInt(totalWeight)+1;
        int start= 0;
        int end = n-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(prefix[mid]>=idx){
                end = mid;
            }
            else{
                start = mid+1;
            }
            
        }
        return start;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
