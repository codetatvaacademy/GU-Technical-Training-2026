class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        m=len(grid)
        n=len(grid[0])
        res=0
        i=m-1
        j=0
        while j<n and i>=0:
            if grid[i][j]<0:
                res += n - j
                i -= 1
            else:
                j+=1
        return res