class Solution {
    public int compareVersion(String version1, String version2) {
        int i =0;
        int j =0;
        
        while(i < version1.length() || j < version2.length()) {
            int nums1 = 0;
            int nums2 = 0;
            
            while(i < version1.length() && version1.charAt(i) != '.') {
                nums1 += nums1 * 10 + (version1.charAt(i) - '0');
                i++;
            }

            while(j < version2.length() && version2.charAt(j) != '.') {
                nums2 += nums2 * 10 + (version2.charAt(j) - '0');
                j++;
            }

            if(nums1 < nums2) {
                return -1;
            }
            else if(nums1 > nums2) {
                return 1;
            }

            i++;
            j++;

        }
        return 0;


    }
}
