class Solution:
    def maxRunTime(self, n: int, batteries: List[int]) -> int:
        minimum = min(batteries)
        maximum = sum(batteries)

        def isPossible(batteries: List[int], mid: int) -> bool:
            total = 0
            goal = n * mid
            for battery in batteries:
                total += min(mid, battery)
            return total >= goal # Return whether the total meets or exceeds the goal

        while minimum <= maximum:
            mid = (minimum + maximum) // 2
            if isPossible(batteries, mid):
                minimum = mid + 1
            else:
                maximum = mid - 1

        return maximum

        