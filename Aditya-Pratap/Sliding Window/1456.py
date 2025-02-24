class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        new="aeiou"
        count=0
        for i in range(k):
            if s[i] in new:
                count+=1
        max_count=count
        i,j=0,k
        while j<len(s):
            if s[j] in new:
                count+=1
            if s[i] in new:
                count-=1
            max_count = max(max_count, count)  
            j+=1
            i+=1
        return max_count