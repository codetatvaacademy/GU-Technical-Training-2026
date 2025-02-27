public class SortArray {
    public int[] sortArray(int[] nums) {
        if(nums==null|| nums.length<=1){
            return nums;
        }
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
    private void mergeSort(int[]nums, int low, int high){
        if(low>=high){
            return ;
        }
        int mid=(high+low)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums, mid+1,high);
        merge(nums, low, mid, high);
    }
    private void merge(int[]nums, int low, int mid, int high){
        int []temp= new int[high-low+1];
        int left= low;
        int right=mid+1;
        int k=0;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp[k++]=nums[left++];
            }else{
                temp[k++]=nums[right++];
            }
        }
        while(left<=mid){
            temp[k++]=nums[left++];
        }
        while(right<=high){
            temp[k++]=nums[right++];
        }
        for (int i = 0; i <temp.length; i++) {
            nums[i+low] = temp[i];
        }
    }
}
