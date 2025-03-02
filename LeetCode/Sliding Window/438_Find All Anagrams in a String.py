class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        start=0
        end=0
        ans = []
        if len(s) < len(p):
            return ans
        frequencyP = [0] * 26
        frequencyS = [0] * 26   
        for ch in p:
            frequencyP[ord(ch) - ord('a')]+=1
        while end<len(s):
            frequencyS[ord(s[end])-ord('a')]+=1
            if end-start+1>len(p):
                frequencyS[ord(s[start])-ord('a')]-=1
                start+=1
            if end-start+1==len(p):
                if frequencyP==frequencyS:
                    ans.append(start)
            end+=1
        return ans
        