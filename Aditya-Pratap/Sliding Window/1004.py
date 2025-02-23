class Solution:
    def longestOnes(self, nums: List[int], k: int) -> int:
        n=len(nums)
        m,i=0,0
        for j in range(n):
            if nums[j]==0:
                k-=1
            while k<0:
                if nums[i]==0:
                    k+=1
                i+=1

            m=max(j-i+1,m)
        return m