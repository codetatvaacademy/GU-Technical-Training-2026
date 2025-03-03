class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        res=0
        for i in range(1,len(nums),2):
            res+=nums[i-1]
        return res

