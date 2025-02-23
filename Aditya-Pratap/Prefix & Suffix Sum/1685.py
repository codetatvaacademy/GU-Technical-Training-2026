class Solution:
    def getSumAbsoluteDifferences(self, nums: list[int]) -> list[int]:
        n = len(nums)
        prefix = [0] * n
        prefix[0] = nums[0]
        
        for i in range(1, n):
            prefix[i] = prefix[i - 1] + nums[i]
        
        result = [0]*n
        for i in range(n):
            left_sum = prefix[i - 1] if i > 0 else 0
            right_sum = prefix[n - 1] - prefix[i]
           
            # total_left = nums[i] * i - left_sum
            # total_right = right_sum - nums[i] * (n - i - 1)
         
            result[i]=nums[i] * i - left_sum + right_sum - nums[i] * (n - i - 1)
        
        return result
