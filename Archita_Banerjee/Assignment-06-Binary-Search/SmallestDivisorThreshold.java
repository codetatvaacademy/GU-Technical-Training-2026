public class SmallestDivisorThreshold {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int max= 0;
        for(int i=0;i<n;i++){
            max=Math.max(max, nums[i]);
        }
        int min=1;
        while(min<=max){
            int mid=(min+max)/2;
            if(sumByD(nums, mid)<=threshold){
                max=mid-1;
            }else{
                min = mid+1;
            }
        }
        return min;
    }
    public static int sumByD(int nums[], int mid){
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.ceil((double)(nums[i])/ (double)(mid));
        }
        return sum;
    }
}
