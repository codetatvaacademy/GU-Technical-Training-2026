class Solution:
    def minOperations(self, nums: List[int], x: int) -> int:
        x=-x
        for num in nums:
            x += num
        if x<0:
            return -1
        if x==0:
            return len(nums)
        
        maxLength=-1
        start=0
        end=0
        
        while end<len(nums):
            x-=nums[end]
            while x<0:
                x+=nums[start]
                start+=1
            if x==0:
                maxLength=max(maxLength,end-start+1)
            end+=1
        if maxLength == -1:
            return -1
        else:
            return len(nums)-maxLength
        