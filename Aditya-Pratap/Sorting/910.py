class Solution:
    def smallestRangeII(self, nums: List[int], k: int) -> int:
        nums.sort()
        n=len(nums)
        ans=nums[n-1]-nums[0]
        left=nums[0]+k
        right=nums[n-1]-k
        for i in range(n-1):
            mini=min(left,nums[i+1]-k)
            maxn=max(right,nums[i]+k)
            ans=min(ans,maxn-mini)
        return ans