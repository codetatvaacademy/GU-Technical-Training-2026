class Solution:
    def maxArea(self, h: int, w: int, horizontalCuts: List[int], verticalCuts: List[int]) -> int:

        horizontalCuts = sorted(horizontalCuts)
        verticalCuts = sorted(verticalCuts)

        max_width = horizontalCuts[0]
        max_len = verticalCuts[0]

        for i in range(len(horizontalCuts)-1):
            if horizontalCuts[i+1] - horizontalCuts[i] > max_width:
                max_width = horizontalCuts[i+1] - horizontalCuts[i]
        
        if h - horizontalCuts[-1] > max_width:
                max_width = h - horizontalCuts[-1]
        
        for i in range(len(verticalCuts)-1):
            if verticalCuts[i+1] - verticalCuts[i] > max_len:
                max_len = verticalCuts[i+1] - verticalCuts[i]

        if w - verticalCuts[-1] > max_len:
                max_len = w - verticalCuts[-1]

        print(max_len)
        print(max_width)
        return (max_len * max_width) % (10**9 + 7)
        