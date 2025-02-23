class Solution:
    def triangleNumber(self, nums: List[int]) -> int:
        n=len(nums)
        nums.sort()
        ans=0
        for k in range(n-1,1,-1):
            low=0
            high=k-1
            while low<high:
                if nums[low]+nums[high]>nums[k]:
                    ans +=high-low
                    high-=1
                else:
                    low+=1
        return ans