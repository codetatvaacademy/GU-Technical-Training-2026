class Solution:
    def numberOfSubstrings(self, s: str) -> int:
        A,B,C=-1,-1,-1
        count=0
        for i in range(len(s)):
            if s[i]=="a":
                A=i
            if s[i]=="b":
                B=i
            if s[i]=="c":
                C=i
            if A!=-1 and B!=-1 and C!=-1:
                count+=1+min(A,B,C)
        return count