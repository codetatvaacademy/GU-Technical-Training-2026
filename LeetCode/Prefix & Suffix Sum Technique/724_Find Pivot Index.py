class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        total_sum = sum(nums)
        left_sum = 0
        for i, num in enumerate(nums):
            if left_sum == total_sum - left_sum - num:
                return i
            left_sum += num
        return -1

user_input = input("Enter a list of integers separated by spaces: ")
nums = list(map(int, user_input.split()))
solution = Solution()
output = solution.pivotIndex(nums)
print(f"The pivot index for the given list is: {output}")
