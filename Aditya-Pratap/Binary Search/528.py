class Solution:

    def __init__(self, w: List[int]):
        self.a=[0]
        for i in w:
            self.a.append(self.a[-1]+i)
        

    def pickIndex(self) -> int:
        t=random.randint(1,self.a[-1])
        l,r=1,len(self.a)-1
        while l<r:
            mid=(l+r)//2
            if self.a[mid]>=t:
                r=mid
            else:
                l=mid+1
        return l-1


# Your Solution object will be instantiated and called as such:
# obj = Solution(w)
# param_1 = obj.pickIndex()