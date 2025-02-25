public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums[]= new int [m+n];
        int left=0;
        int right=0;
        int ind=0;
        while(left<m && right<n){
            if(nums1[left]<=nums2[right]){
                nums[ind]= nums1[left];
                left++;
                ind++;
            }else{
                nums[ind]= nums2[right];
                right++;
                ind++;
            }

        }
        while(left<m){
            nums[ind++]=nums1[left++];
        }
        while(right<n){
            nums[ind++]=nums2[right++];
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = nums[i];
        }

    }
}
