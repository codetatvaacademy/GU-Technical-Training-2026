class Solution:
    def minSubsequence(self, nums: List[int]) -> List[int]:
        s=sum(nums)
        nums=sorted(nums,reverse=True)
        s2=0
        for i in range(len(nums)):
            s2+=nums[i]
            if s2>s-s2:
                return nums[:i+1]