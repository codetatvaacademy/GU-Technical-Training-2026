from typing import List

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix or not matrix[0]:
            return []
        
        r1, c1 = 0, 0
        r2, c2 = len(matrix), len(matrix[0])
        ans = []
        
        while r1 < r2 and c1 < c2:
            for c in range(c1, c2):
                ans.append(matrix[r1][c])
            r1 += 1
            
            for r in range(r1, r2):
                ans.append(matrix[r][c2 - 1])
            c2 -= 1
            
            if r1 < r2:
                for c in range(c2 - 1, c1 - 1, -1):
                    ans.append(matrix[r2 - 1][c])
                r2 -= 1
            
            if c1 < c2:
                for r in range(r2 - 1, r1 - 1, -1):
                    ans.append(matrix[r][c1])
                c1 += 1
        
        return ans