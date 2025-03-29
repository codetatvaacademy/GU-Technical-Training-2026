from typing import List

class Solution:
    def getSumAbsoluteDifferences(self, nums: List[int]) -> List[int]:
        prefix_sum = [0] * (len(nums) + 1)
        for i in range(len(nums)):
            prefix_sum[i + 1] = prefix_sum[i] + nums[i]
        
        result = []
        for i in range(len(nums)):
            left_sum = nums[i] * i - prefix_sum[i]
            right_sum = prefix_sum[len(nums)] - prefix_sum[i + 1] - nums[i] * (len(nums) - i - 1)
            total_sum = left_sum + right_sum
            result.append(total_sum)
        
        return result

if __name__ == "__main__":
    user_input = input("Enter sorted numbers separated by spaces: ")
    nums = list(map(int, user_input.strip().split()))

    sol = Solution()
    result = sol.getSumAbsoluteDifferences(nums)

    print("Sum of Absolute Differences:", result)

