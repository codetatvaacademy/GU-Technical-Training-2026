class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        m=len(mat)
        n=len(mat[0])
        if m*n != r*c:
            return mat

        result_array=[]
        for row in range(r):
            result_array.append([0]*c)
        index=0
        for i in range(m):
            for j in range(n):
                result_array[index // c][index % c]=mat[i][j]
                index+=1
        return result_array
        