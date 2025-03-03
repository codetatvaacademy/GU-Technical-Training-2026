class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int count = 0;
        int size = 0;
        int start = 0;
        for(int end = 0;end <arr.length;end++){
            size++;
            sum += arr[end];
            while(size > k){
                sum -= arr[start];
                start++;
                size--;
            }
            if(sum/(end-start+1)>= threshold && size == k){
                count++;
            }
        }
        return count;
    }
}