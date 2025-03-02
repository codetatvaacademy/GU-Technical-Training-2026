class Solution:
    def maxScore(self, s: str) -> int:
        ones = s.count('1')
        zeros = 0
        maxscore = 0
        for i in range(len(s) - 1):
            if s[i] == '0':
                zeros += 1
            else:
                ones -= 1
            maxscore = max(maxscore, zeros + ones)
        return maxscore

user_input = input("Enter a binary string: ")
solution = Solution()
output = solution.maxScore(user_input)
print(f"The maximum score for the given binary string is: {output}")
