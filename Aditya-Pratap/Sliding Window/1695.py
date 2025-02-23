class Solution:
    def maximumUniqueSubarray(self, nums: List[int]) -> int:
        a=set()
        j=0
        s=0
        msum=0
        for i in range(len(nums)):
            while nums[i] in a:
                a.remove(nums[j])
                s-=nums[j]
                j+=1
            a.add(nums[i])
            s+=nums[i]
            msum=max(msum,s)
        return msum