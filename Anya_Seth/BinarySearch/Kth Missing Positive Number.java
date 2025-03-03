class Solution {
    public int findKthPositive(int[] arr, int k) {
        int min = 0;
        int max = arr.length - 1;
        while(min <= max){
            int mid = (min + max)/2;
            if(missCount(arr, mid, k)){
                min = mid + 1;
            }
            else{
                max = mid - 1;
            }
        }
        return k + max + 1;
    }
    public boolean missCount(int[] arr, int mid, int k){
        int missCount = arr[mid] - (mid + 1);
        if(missCount < k){
          return true;
        }
        return false;
    }
}
