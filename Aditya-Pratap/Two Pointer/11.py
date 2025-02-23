class Solution:
    def maxArea(self, height: List[int]) -> int:
        n=len(height)
        i,j=0,n-1
        maxarea=0
        while i<j:
            h=min(height[i],height[j])
            b=j-i
            maxarea=max(h*b,maxarea)
            if height[i]<=height[j]:
                i+=1
            else:
                j-=1
        
        return maxarea
