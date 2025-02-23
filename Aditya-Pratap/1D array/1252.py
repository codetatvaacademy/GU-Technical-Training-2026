class Solution:
    def oddCells(self, m: int, n: int, indices: List[List[int]]) -> int:
        row=[False]*m
        col=[False]*n
        for r,c in indices:
            row[r]^=True
            col[c]^=True
        oddRow=row.count(True)
        oddCol=col.count(True)
        evenRow = m-oddRow
        evenCol=n-oddCol
        return oddRow*evenCol + evenRow*oddCol