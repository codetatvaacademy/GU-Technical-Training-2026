class Solution:
    def maxWidthOfVerticalArea(self, points: List[List[int]]) -> int:
        sp = sorted(points, key=lambda x: x[0])
        width = 0
        for i in range(1, len(sp)):
            width = max(sp[i][0] - sp[i-1][0], width)
        
        return width