class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n=len(nums)
        if n==3 and sum(nums)==0:
            return [nums]
        nums.sort()
        res=[]
        for i in range(n):
            if i>0 and nums[i]==nums[i-1]:
                continue
            j,k=i+1,n-1
            while j<k:
                s=nums[i]+nums[j]+nums[k]
                if s<0:
                    j+=1
                elif s>0:
                    k-=1
                else:
                    res.append([nums[i],nums[j],nums[k]])
                    while j < k and nums[j] == nums[j + 1]:
                        j += 1
                    while j < k and nums[k] == nums[k - 1]:
                        k -= 1
                    j += 1
                    k -= 1
        return res