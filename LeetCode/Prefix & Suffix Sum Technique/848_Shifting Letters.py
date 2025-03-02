class Solution:
    def shiftingLetters(self, s: str, shifts: List[int]) -> str:
        n = len(shifts)
        for i in range(n - 2, -1, -1):
            shifts[i] += shifts[i + 1]
        
        shifted_s = list(s)
        for i in range(n):
            shifted_s[i] = chr((ord(s[i]) - ord('a') + shifts[i]) % 26 + ord('a'))
        
        return ''.join(shifted_s)


s = input("Enter a string: ")
shifts_input = input("Enter a list of integers representing shifts, separated by spaces: ")
shifts = list(map(int, shifts_input.split()))
solution = Solution()
output = solution.shiftingLetters(s, shifts)
print(f"The shifted string is: {output}")
