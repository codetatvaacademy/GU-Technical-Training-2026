class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        answer = [1] * len(nums)
        left = [1] * len(nums)

        for i in range(1, len(nums)):
            left[i] = nums[i-1] * left[i-1]
        
        right = [1] * len(nums)
        for i in range(len(nums)-2, -1, -1):
            right[i] = nums[i+1] * right[i+1]
        
        for i in range(len(nums)):
            answer[i] = left[i] * right[i]
        
        return answer

user_input = input("Enter a list of integers separated by spaces: ")
nums = list(map(int, user_input.split()))
solution = Solution()
output = solution.productExceptSelf(nums)
print(f"The product array except self is: {output}")
