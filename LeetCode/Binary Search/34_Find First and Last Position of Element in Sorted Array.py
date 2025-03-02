class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:       
        count=0
        for i in range(len(nums)):
            if nums[i]==target:
                count+=1
            else:
                count+=0

        return count
        