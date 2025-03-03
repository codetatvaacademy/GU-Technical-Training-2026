class Solution:
    def shiftingLetters(self, s: str, shifts: List[int]) -> str:
        n = len(s)
        suffix = [0]*n
        suffix[n - 1] = shifts[n - 1]
        
        # Calculate the suffix sums
        for i in range(n - 2, -1, -1):
            suffix[i] = shifts[i] + suffix[i + 1]
        
        ans = []
        for c, shift in zip(s, suffix):
            new_char = chr((string.ascii_lowercase.index(c) + shift) % 26+ord('a'))
            ans.append(new_char)
        return ''.join(ans)
