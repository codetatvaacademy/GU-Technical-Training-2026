public class NiceSubArrays {
    public int numberOfSubarrays(int[] nums, int k) {
        int niceSub= atmost(nums,k) - atmost(nums,k-1);
        return niceSub;
    }
    public int atmost(int []arr, int k){
        int start=0;
        int cnt=0;
        for(int end=0;end<arr.length;end++){
            if(arr[end]%2!=0){
                k--;
            }

            while(k<0){
                if(arr[start]%2 !=0){
                    k++;
                }
                start++;
            }
            cnt += end-start+1;
        }
        return cnt;
    }
}
