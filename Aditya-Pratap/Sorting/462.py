class Solution:
    def minMoves2(self, nums: List[int]) -> int:
        nums.sort()
        m=len(nums)//2
        ele=nums[m]
        s=0
        for i in range(len(nums)):
            s+=abs(ele-nums[i])
        return s