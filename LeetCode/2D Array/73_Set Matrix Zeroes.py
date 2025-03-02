class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        rowset=False
        colset=False
        for row in range(len(matrix)):
            if matrix[row][0]==0:
                colset=True
        for col in range(len(matrix[0])):
            if matrix[0][col]==0:
                rowset=True
        for row in range(1,len(matrix)):
            for col in range(1,len(matrix[0])):
                if matrix[row][col]==0:
                    matrix[row][0]=0
                    matrix[0][col] =0
        for row in range(1,len(matrix)):
            for col in range(1,len(matrix[0])):
                if matrix[row][0]==0 or matrix[0][col]==0:
                    matrix[row][col]=0
        if rowset==True:
            for col in range(len(matrix[0])):
                matrix[0][col]=0

        if colset==True:
            for row in range(len(matrix)):
                matrix[row][0]=0

        