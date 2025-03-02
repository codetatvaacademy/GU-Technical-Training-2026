class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        def isPossible(piles, k, h):
            hours = 0
            for pile in piles:
                hours += -(-pile // k)  
            return hours <= h

        minimum = 1
        maximum = max(piles)
        while minimum <= maximum:
            mid = (minimum + maximum) // 2
            if isPossible(piles, mid, h):
                maximum = mid - 1
            else:
                minimum = mid + 1

        return minimum
        