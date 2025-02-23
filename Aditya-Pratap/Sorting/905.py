class Solution:
    def sortArrayByParity(self, nums: List[int]) -> List[int]:
        if len(nums)==1:
            return nums
        i=0
        j=len(nums)-1
        while i<j:
            while i<j and nums[i]%2==0:
                i+=1
            while i<j and nums[j]%2==1:
                j-=1
            # if nums[i]%2==1 and nums[j]%2==0:
            nums[i],nums[j]=nums[j],nums[i]
            i+=1
            j-=1
        return nums