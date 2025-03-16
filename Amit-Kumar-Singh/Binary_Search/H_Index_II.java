class Solution {
    public int hIndex(int[] citations) {
        int n =citations.length;
        int start = 0;
        int end = n-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(citations[mid]==n-mid){
                return citations[mid];
            }
            else if(citations[mid]<n-mid){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return n-start;
    }
}