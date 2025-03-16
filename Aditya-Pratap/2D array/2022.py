class Solution:
    def construct2DArray(self, original: List[int], m: int, n: int) -> List[List[int]]:
        l=len(original)
        if l!=m*n:
            return []
        res=[]
        i=0
        for j in range(m):
            res.append(original[i:i+n])
            i+=n
        return res