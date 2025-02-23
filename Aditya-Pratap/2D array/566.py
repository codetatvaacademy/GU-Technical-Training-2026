class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        if len(mat)*len(mat[0]) != r*c:
            return mat
        res=[[0]*c for _ in range(r)]
        k=0
        for i in mat:
            for j in i:
                res[k//c][k%c]=j
                k+=1
        return res