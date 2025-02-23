class Solution:
    def minIncrementForUnique(self, nums: List[int]) -> int:
        n = len(nums)
        m = max(nums) if nums else 0
        arr = [0] * (n + m + 1)
        
        for num in nums:
            arr[num] += 1
        
        score = 0
        
        for i in range(len(arr) - 1):
            if arr[i] > 1:
                score += arr[i] - 1
                arr[i + 1] += arr[i] - 1
        
        return score