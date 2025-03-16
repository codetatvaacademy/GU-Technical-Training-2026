class Solution:
    def validCheck(self, nums: List[int], mid: int, o) -> bool:
        for num in nums:
            if num>mid:
                op=(num-1)//mid
                o -=op
            if o<0:
                return False
        return True

    def minimumSize(self, nums: List[int], o: int) -> int:
        minValue = 1
        maxValue = max(nums)
        n = len(nums)
        while minValue < maxValue:
            mid = (minValue + maxValue) // 2
            if self.validCheck(nums, mid, o):
                maxValue = mid
            else:
                minValue = mid + 1

        return minValue
