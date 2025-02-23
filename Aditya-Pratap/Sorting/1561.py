class Solution:
    def maxCoins(self, piles: List[int]) -> int:
        piles.sort()
        m=0
        n=len(piles)
        for i in range(n//3,n,2):
            m+=piles[i]
        return m