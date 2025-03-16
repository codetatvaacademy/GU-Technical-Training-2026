class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        n=len(candies)
        arr=[False]*n
        m=max(candies)
        for i in range(n):
            if candies[i]+extraCandies>=m:
                arr[i]=True
        return arr
