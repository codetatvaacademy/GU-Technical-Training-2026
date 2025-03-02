class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        start=0
        end=0
        sum_target=0
        length=0
        minLength=len(nums)+1
        while end<len(nums):
            sum_target+=nums[end]
            while sum_target>=target:
                minLength=min(end-start+1,minLength)
                sum_target-=nums[start]
                start+=1
            end+=1
        if minLength==len(nums)+1:
            return 0

        return minLength

        