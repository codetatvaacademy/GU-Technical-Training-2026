class Solution:
    def generateMatrix(self, n: int) -> List[List[int]]:
        a = [[0] * n for _ in range(n)]
        count=1
        r1,c1=0,0
        r2,c2=n,n
        while r1<r2 and c1<c2:
            for c in range(c1,c2):
                a[r1][c]=count
                count+=1
            r1 +=1
            for r in range(r1,r2):
                a[r][c2-1]=count
                count+=1
            c2 -=1
            if r1<r2:
                for c in range(c2 - 1, c1 - 1,-1):
                    a[r2-1][c]=count
                    count+=1
                r2 -=1
            if c1<c2:
                for r in range(r2-1,r1-1,-1):
                    a[r][c1]=count
                    count+=1
                c1 +=1
        return a