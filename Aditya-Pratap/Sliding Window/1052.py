class Solution:
    def maxSatisfied(
        self, customers: List[int], grumpy: List[int], minutes: int) -> int:
        n = len(grumpy)
        un = 0
        for i in range(minutes):
            un += grumpy[i] * customers[i]
        maxun = un
        for i in range(minutes, n):
            un += grumpy[i] * customers[i]
            un -= grumpy[i - minutes] * customers[i - minutes]
            maxun = max(un, maxun)
        maxsat = 0
        for i in range(n):
            maxsat += (1 - grumpy[i]) * customers[i]
        return maxsat + maxun
