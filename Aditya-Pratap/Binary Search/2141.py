class Solution:
    def isPossible(self, n: int, batteries: List[int], mid: int) -> bool:
        power = 0
        for b in batteries:
            power += min(b, mid)
        return power >= n * mid

    def maxRunTime(self, n: int, batteries: List[int]) -> int:
        if n==1:
            return sum(batteries)
        if n>len(batteries):
            return 0
        totalSum = sum(batteries)
        left = 1
        right = totalSum
        res = 0
        while left < right:
            mid = (left + right) // 2
            if self.isPossible(n, batteries, mid):
                res = mid
                left = mid + 1
            else:
                right = mid

        return res
