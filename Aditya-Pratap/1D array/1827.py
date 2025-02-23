class Solution:
    def minOperations(self, nums: List[int]) -> int:
        max_num = operations = 0
        for num in nums:
            if num > max_num:
                max_num = num
            else:
                max_num += 1
                operations += max_num - num
        return operations