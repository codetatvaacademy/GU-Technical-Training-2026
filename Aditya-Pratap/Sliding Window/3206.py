class Solution:
    def numberOfAlternatingGroups(self, colors: List[int]) -> int:
        count=0
        n=len(colors)
        i,j=0,1
        if colors[i]!=colors[n-1] and colors[j]!=colors[i]:
            count+=1
            i,j=1,2
        while i<n:
            x=j%n
            if colors[i-1]!=colors[i] and colors[i]!=colors[x]:
                count+=1
            i+=1
            j+=1
            
        return count