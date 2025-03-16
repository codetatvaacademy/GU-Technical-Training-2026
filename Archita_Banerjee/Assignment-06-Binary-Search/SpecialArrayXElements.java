public class SpecialArrayXElements {
    public int specialArray(int[] nums) {
        int low=0;
        int high=nums.length;
        while(low<=high){
            int mid=(low+high)/2;
            int cnt=0;
            for(int num:nums){
                if(num>=mid){
                    cnt++;
                }
            }
            if(cnt==mid){
                return mid;
            }else if(cnt > mid){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}
