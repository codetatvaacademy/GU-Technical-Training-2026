public class Leftmostmiddleindex {
    public int leftMiddleIndex(int[] nums){
        int leftsum=0;
        int totalsum=0;

        for(int num:nums){
            totalsum += num;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (leftsum == totalsum - leftsum - nums[i]) {
                return i; 
            }
            leftsum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,-1,8,4};
        int[] nums1= {1,-1,4};
        int[] nums2= {2,5};
        Leftmostmiddleindex obj = new Leftmostmiddleindex();
        System.out.println(obj.leftMiddleIndex(nums));
        System.out.println(obj.leftMiddleIndex(nums1));
        System.out.println(obj.leftMiddleIndex(nums2));
    }
}
