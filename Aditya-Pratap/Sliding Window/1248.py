class Solution:
    def subarray(self,nums:List[int],k:int)->int:
        count,odd=0,0
        i=0
        for j in range(len(nums)):
            if nums[j]%2==1:
                odd+=1
            while odd>k:
                if nums[i]%2==1:
                    odd-=1
                i+=1
            count+=j-i+1
        return count
    def numberOfSubarrays(self, nums: List[int], k: int) -> int:
        return self.subarray(nums,k)-self.subarray(nums,k-1)
        