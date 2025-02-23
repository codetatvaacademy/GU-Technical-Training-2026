class Solution:
    def createTargetArray(self, nums: List[int], index: List[int]) -> List[int]:
        l=len(nums)
        res=[]
        for i in range(l):
            res.insert(index[i],nums[i])
        return res