class Solution:
    def getSumAbsoluteDifferences(self, nums: List[int]) -> List[int]:
        n = len(nums)
        prefix_sum = [0] * (n + 1)
        for i in range(n):
            prefix_sum[i + 1] = prefix_sum[i] + nums[i]

        result = [0] * n
        for i in range(n):
            left_sum = nums[i] * i - prefix_sum[i]
            right_sum = (prefix_sum[n] - prefix_sum[i + 1]) - nums[i] * (n - i - 1)
            result[i] = left_sum + right_sum
        
        return result

user_input = input("Enter a list of integers separated by spaces: ")
nums = list(map(int, user_input.split()))
solution = Solution()
output = solution.getSumAbsoluteDifferences(nums)
print(f"The sum of absolute differences for the given list is: {output}")
