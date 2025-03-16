class Solution:
    def minStartValue(self, nums: List[int]) -> int:
        n=len(nums)
        newArray=[0]*(n+1)
        newArray[1]=nums[0]
        for i in range(2,n+1):
                newArray[i] = nums[i-1] + newArray[i-1]
        return abs(min(newArray))+1
