class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        size=len(mat)
        s=0
        for i in range(size):
            for j in range(size):
                if i==j:
                    s += mat[i][j]
                
                elif i+j==size-1:
                    s += mat[i][j]
                    
        return s