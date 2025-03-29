class Solution:
    def minStartValue(self, nums: List[int]) -> int:
        prefix_sum = 0
        minimum = 0
        for num in nums:
            prefix_sum += num
            minimum = min(prefix_sum, minimum)
        return -minimum + 1
user_input = input("Enter a list of integers separated by spaces: ")
nums = list(map(int, user_input.split()))
solution = Solution()
output = solution.minStartValue(nums)
print(f"The minimum starting value is: {output}")
