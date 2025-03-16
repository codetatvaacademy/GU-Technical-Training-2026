class Solution:
    def reverseVowels(self, s: str) -> str:
        v="AEIOUaeiou"
        i=0
        j=len(s)-1
        res=list(s)
        while i<j:
            while i<j and res[i] not in v:
                i+=1
            while i<j and res[j] not in v:
                j-=1
            res[i],res[j]=res[j],res[i]
            i+=1
            j-=1
        return "".join(res)