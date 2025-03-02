class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        start = 0
        end = len(nums) - 1
        
        while start <= end:
            mid = start + (end - start) // 2
            if nums[mid] == target:     #value of mid
                return mid              #index of mid
            elif nums[mid] > target:
                end = mid - 1
            else:
                start = mid + 1
                
        return start
