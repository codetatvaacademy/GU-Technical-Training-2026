class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        n=len(mat)
        ans=0
        for i in range(n):
            ans+=mat[i][i]
            ans+=mat[n-1-i][i]

        if n%2!=0:
            ans-=mat[n//2][n//2]   
        return ans     