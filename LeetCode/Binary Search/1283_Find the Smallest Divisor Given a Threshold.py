class Solution:
    def smallestDivisor(self, nums: List[int], threshold: int) -> int:
        n = len(nums)
        max_val = max(nums)
        min_val = 1

        while min_val <= max_val:
            mid = (min_val + max_val) // 2
            if self.sumByD(nums, mid) <= threshold:
                max_val = mid - 1
            else:
                min_val = mid + 1

        return min_val

    def sumByD(self, nums, mid):
        total_sum = 0
        for num in nums:
            total_sum += math.ceil(num / mid)
        return total_sum
       
        
        