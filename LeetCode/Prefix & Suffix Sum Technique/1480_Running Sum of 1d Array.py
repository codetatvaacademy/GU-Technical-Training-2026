class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        running_sum = [0] * len(nums)
        running_sum[0] = nums[0]
        for i in range(1, len(nums)):
            running_sum[i] = running_sum[i - 1] + nums[i]
        return running_sum


user_input = input("Enter a list of integers separated by spaces: ")
nums = list(map(int, user_input.split()))
solution = Solution()
output = solution.runningSum(nums)
print(f"The running sum of the given list is: {output}")
