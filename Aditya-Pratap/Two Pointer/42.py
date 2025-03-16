class Solution:
    def trap(self, height: List[int]) -> int:
        res=0
        n=len(height)
        i,j=0,n-1
        left,right=0,0
        while i<j:
            if height[i]<=height[j]:
                if height[i]>=left:
                    left=height[i]
                else:
                    res+=left-height[i]
                i+=1
            else:
                if height[j]>=right:
                    right=height[j]
                else:
                    res+=right-height[j]
                j-=1
        return res