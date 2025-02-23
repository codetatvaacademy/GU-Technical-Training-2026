class Solution:
    def mySqrt(self, x: int) -> int:
        l,r=1,x+1
        while l<r:
            m=(l+r)//2
            if(m>(x/m)):
                r=m
            else:
                l=m+1
        return int(l)-1