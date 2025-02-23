class Solution:
    def sortColors(self, nums: List[int]) -> None:
        cur=0
        indx0=-1
        indx2=len(nums)
        while cur<indx2:
            if nums[cur]==0:
                indx0+=1
                nums[indx0], nums[cur]=nums[cur],nums[indx0]
                cur+=1
            elif nums[cur]==2:
                indx2-=1
                nums[indx2], nums[cur]=nums[cur],nums[indx2]
            else:
                cur+=1
