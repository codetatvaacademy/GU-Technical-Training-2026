class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            int missing=arr[mid]-(mid+1);
            if(missing<k){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end+1+k;
    }
}