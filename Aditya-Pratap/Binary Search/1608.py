class Solution:
    def isPossible(self,nums:List[int],n:int)->int:
        val=0
        for num in nums:
            if num>=n:
                val+=1
        return val

    def specialArray(self, nums: List[int]) -> int:
        ans=-1
        low,high=0,len(nums)
        while low<=high:
            mid=(low+high)//2
            if self.isPossible(nums,mid)==mid:
                ans=mid
                return mid
            elif self.isPossible(nums,mid)>mid:
                low=mid+1
            else:
                high=mid-1
        return ans