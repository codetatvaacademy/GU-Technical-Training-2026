class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int s=0;
        int e=0;
        int sum1=0;
        int sum2=0;
        int k1=k;
        while(e<nums.length)
        {
            
            if(nums[e]%2!=0)
            k1--;
            while(k1<0)
            {
                if(nums[s]%2!=0)
                    k1++;
                s++;
            }
            sum1+=e-s+1;
            e++;
        }
        k1=k-1;
        s=0;
        e=0;
        while(e<nums.length)
        {
            
            if(nums[e]%2!=0)
                k1--;
            while(k1<0)
            {
                if(nums[s]%2!=0)
                    k1++;
                s++;
            }
            sum2+=e-s+1;
            e++;
        }
       
        return sum1-sum2;
        
    }
}