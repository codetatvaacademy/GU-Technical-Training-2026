class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        n = len(nums)
        ans = n+1
        left = 0
        sum = 0
        for i in range(n):
            sum += nums[i]
            while sum >= target:
                ans = min(ans, i + 1 - left)
                sum -= nums[left]
                left += 1
        return 0 if ans == n+1 else ans


