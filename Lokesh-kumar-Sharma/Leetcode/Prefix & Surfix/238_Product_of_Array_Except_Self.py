from typing import List

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        res = [1] * n

        left = 1
        for i in range(n):
            res[i] *= left
            left *= nums[i]

        right = 1
        for i in range(n - 1, -1, -1):
            res[i] *= right
            right *= nums[i]

        return res

if __name__ == "__main__":
    user_input = input("Enter numbers separated by spaces: ")
    nums = list(map(int, user_input.strip().split()))
    
    sol = Solution()
    result = sol.productExceptSelf(nums)
    
    print("Result:", result)

