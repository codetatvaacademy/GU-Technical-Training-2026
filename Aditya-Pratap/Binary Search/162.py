class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        if len(nums)==1:
            return 0
        if len(nums)==2:
            if nums[0]>nums[1]:
                return 0
            else:
                return 1
        l=0
        h=len(nums)-1
        while l<h:
            mid=(l+h)//2
            if nums[mid]>nums[mid+1]:
                h=mid
            else:
                l=mid+1
        return l
            
            