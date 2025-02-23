class Solution:
    def numberOfAlternatingGroups(self, colors: List[int], k: int) -> int:
        n=len(colors)
        res=0
        counter=1
        for i in range(-k+2,n,1):
            if colors[i]!=colors[i-1]:
                counter+=1
            else:
                counter=1
            if counter>=k:
                res+=1
        return res