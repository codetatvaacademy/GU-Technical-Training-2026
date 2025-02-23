class Solution:
    def minPairSum(self, nums: List[int]) -> int:
        nums.sort()
        s=0
        i,j=0,len(nums)-1
        while i<j:
            if nums[i]+nums[j]>s:
                s=nums[i]+nums[j]
            i+=1
            j-=1
        return s