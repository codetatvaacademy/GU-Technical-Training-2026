class NumArray:

    def __init__(self, nums: List[int]):
        n = len(nums)
        self.prefix_sum = [0] * (n + 1)
        for i in range(n):
            self.prefix_sum[i + 1] = self.prefix_sum[i] + nums[i]

    def sumRange(self, left: int, right: int) -> int:
        return self.prefix_sum[right + 1] - self.prefix_sum[left]
    
user_input = input("Enter a list of integers separated by spaces: ")
nums = list(map(int, user_input.split()))
num_array = NumArray(nums)
left = int(input("Enter the left index of the range: "))
right = int(input("Enter the right index of the range: "))
output = num_array.sumRange(left, right)
print(f"The sum of the range from index {left} to {right} is: {output}")
