class Solution:
    def construct2DArray(self, original: List[int], m: int, n: int) -> List[List[int]]:
        if m*n != len(original):
            return []
        
        result_array=[]
        for row in range(m):
            result_array.append([0]*n)
        index=0
        for i in range(m):
            for j in range(n):
                result_array[i][j]=original[index]
                index+=1
        return result_array
        