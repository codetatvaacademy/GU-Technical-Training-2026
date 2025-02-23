class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        nums = [x * x for x in nums]
        nums.sort()
        return nums