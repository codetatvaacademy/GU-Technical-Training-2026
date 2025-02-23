class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) <= 1:
            return len(s)
        
        arr = [0] * 128
        a, e = 0, 0
        maxLength = 0
        
        while e < len(s):
            diff = s[e]
            arr[ord(diff)] += 1
            
            while arr[ord(diff)] > 1:
                d = s[a]
                arr[ord(d)] -= 1
                a += 1
            
            maxLength = max(maxLength, e - a + 1)
            e += 1
        
        return maxLength