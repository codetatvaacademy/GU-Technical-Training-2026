class Solution:
    def numberOfSubstrings(self, s: str) -> int:
        start = 0
        a_index = -1
        b_index = -1
        c_index = -1
        count =  0
        for end in range(len(s)):
            char = s[end]
            if char == "a":
                a_index = end
            elif char == "b":
                b_index = end
            else:
                c_index  = end    
            count+=min(a_index,b_index,c_index) - start + 1 
        return count