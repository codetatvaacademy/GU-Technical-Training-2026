class Solution:
    def maxDistance(self, position: List[int], m: int) -> int:
        position.sort()
        min_val = 1
        max_val = position[-1] - position[0]

        while min_val <= max_val:
            mid = (min_val + max_val) // 2
            if self.isPossible(mid, position, m):
                min_val = mid + 1
            else:
                max_val = mid - 1

        return max_val
    def isPossible(self, mid, arr, m):
        f_ball = arr[0]
        m -= 1

        for i in range(1, len(arr)):
            if arr[i] - f_ball >= mid:
                m -= 1
                f_ball = arr[i]

        return m <= 0
       