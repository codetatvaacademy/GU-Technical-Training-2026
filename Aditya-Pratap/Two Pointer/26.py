class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        n=len(nums)
        i=0
        for j in range(n-1):
            if nums[j]!=nums[j+1]:
                nums[i]=nums[j]
                i+=1
            
        nums[i]=nums[n-1]
        i+=1
        return i
