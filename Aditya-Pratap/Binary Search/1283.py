import math


class Solution:
    def checkDivisor(self, nums: List[int], mid: int, threshold: int):
        s = 0
        for i in range(len(nums)):
            s += math.ceil(nums[i] / mid)
            if s > threshold:
                return False
        return True

    def smallestDivisor(self, nums: List[int], threshold: int) -> int:
        minValue = 1
        maxValue = max(nums)
        while minValue < maxValue:
            mid = (minValue + maxValue) // 2
            if self.checkDivisor(nums, mid, threshold):
                maxValue = mid
            else:
                minValue = mid + 1
        return minValue
