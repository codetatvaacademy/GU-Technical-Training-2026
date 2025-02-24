public class SumAbsDiff {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n= nums.length;
        int prefix[]= new int[n];
        prefix[0]= nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1] + nums[i];
        }
        int []ans= new int[n];
        for(int i=0;i<n;i++){
            int lsum= prefix[i]-nums[i];
            int lcnt= i;
            int rsum=prefix[n-1]-prefix[i];
            int rcnt= n-1-i;

            int lans= nums[i] * lcnt-lsum;
            int rans= rsum- nums[i] * rcnt;
            ans[i]=lans+rans;
        }
        return ans;
    }
}
