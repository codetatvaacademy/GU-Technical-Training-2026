class Solution:
    def transpose(self, matrix: List[List[int]]) -> List[List[int]]:
        row=len(matrix)
        col=len(matrix[0])
        return [[matrix[i][j] for i in range(row)]for j in range(col)]