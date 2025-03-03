class Solution:
    def equalSubstring(self, s: str, t: str, maxCost: int) -> int:
        n=0
        newCost=0
        for i in range(len(s)):
            newCost+=abs(ord(s[i])-ord(t[i]))
            if newCost>maxCost:
                newCost-=abs(ord(s[n])-ord(t[n]))
                n+=1
        return len(s)-n
