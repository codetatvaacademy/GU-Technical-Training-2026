class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m-1;
        int ptr2 = n-1;
        int i = nums1.length-1;
        while(ptr2>=0){
            if(ptr1>=0 && nums1[ptr1]>nums2[ptr2]){
                nums1[i] = nums1[ptr1];
                ptr1--;
                i--;
            }
            else{
                nums1[i] = nums2[ptr2];
                ptr2--;
                i--;
            }
        }
    }
}