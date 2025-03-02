class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        start=0
        end=0
        maxValue=0
        arr=[-1]*128
        for end in range(len(s)):
            char=s[end]
            if arr[ord(char)]>=start:
                start=arr[ord(char)]+1
            arr[ord(char)]=end
            maxValue=max(maxValue,end-start+1)
        return maxValue

        