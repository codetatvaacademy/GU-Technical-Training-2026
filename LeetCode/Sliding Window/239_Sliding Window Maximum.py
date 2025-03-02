class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        n=len(nums)
        leftmax=[0]*n
        rightmax=[0]*n
        for i in range(n):
            if i == 0 or i % k ==0:
                leftmax[i]=nums[i]
            else:
                leftmax[i]=max(leftmax[i-1],nums[i])
        for j in range(n-1,-1,-1):
            if j== n-1 or (j+1)%k==0:
                rightmax[j]=nums[j]
            else:
                rightmax[j]=max(rightmax[j+1],nums[j])
        arr=[]
        for i in range(k-1,n):
            arr.append(max(rightmax[i-k+1],leftmax[i]))
        return arr






        