from typing import List

class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        total_sum = sum(nums)
        left_sum = 0
        for i, num in enumerate(nums):
            if left_sum == total_sum - left_sum - num:
                return i
            left_sum += num
        return -1

if __name__ == "__main__":
    user_input = input("Enter numbers separated by spaces: ")
    nums = list(map(int, user_input.strip().split()))

    sol = Solution()
    result = sol.pivotIndex(nums)

    print("Pivot Index:", result)

