class Solution:
    def speedCheck(self,piles:List[int],mid:int,h:int)->bool:
        #taking varible t to store the total time taken to eat all the bananas
        t = 0  
        for pile in piles:
            unitConsume = (pile + mid - 1) // mid
            t += unitConsume  
        h -= t
        return h>=0
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        low=1
        high=max(piles)
        while low<high:
            mid=(low+high)//2
            if self.speedCheck(piles,mid,h):
                high=mid
            else:
                low = mid+1
        return low