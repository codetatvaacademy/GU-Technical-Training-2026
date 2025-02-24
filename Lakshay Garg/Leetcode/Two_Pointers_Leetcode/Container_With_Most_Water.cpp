class Solution {
    public int maxArea(int[] h) {
        int n=h.length;
        int i=0,j=n-1,ans=0;
        int count =0;
        while(i<=j){
            count=Math.min(h[i],h[j])*(j-i);
            ans=Math.max(ans,count);
            if(h[i]>h[j]) j--;
            else i++;
        }
        return ans;
    }
}
