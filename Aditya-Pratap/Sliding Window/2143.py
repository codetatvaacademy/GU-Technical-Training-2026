class Solution:
    def minSwaps(self, nums: List[int]) -> int:
        n=len(nums)
        one=nums.count(1)
        zero=0
        minswap=one
        for i in range(one):
            if nums[i]==0:
                zero+=1
        minswap=min(zero,minswap)
        for i in range(1,n):
            if nums[i-1]==0:
                zero-=1
            if nums[(i+one-1)%n]==0:
                zero+=1
            minswap=min(zero,minswap)
        return minswap