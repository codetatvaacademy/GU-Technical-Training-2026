class Solution:
    def equalSubstring(self, s: str, t: str, maxCost: int) -> int:
        start=0
        end=0
        n=len(s)
        cost=0
        maxLength=0
        while end<n:
            cost+=abs(ord(s[end])-ord(t[end]))
            while cost>maxCost:
                cost-=abs(ord(s[start])-ord(t[start]))
                start+=1
            maxLength=max(maxLength,end-start+1)
            end+=1
        return maxLength
