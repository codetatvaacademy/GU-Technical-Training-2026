class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        expect=sorted(heights)
        res=0
        for i in range(len(heights)):
            if heights[i] != expect[i]:
                res+=1
        return res