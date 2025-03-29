class Solution:
    def maxScore(self, s: str) -> int:
        L = len(s)
        l = 0
        r = len([c for c in s if c == "1"])
        mx = 0

        for i in range(L - 1):
            if s[i] == "1":
                r -= 1
            else:
                l += 1

            t = l + r

            if mx < t:
                mx = t

        return mx

if __name__ == "__main__":
    s = input("Enter a binary string (only 0's and 1's): ")

    if not all(c in "01" for c in s):
        print("Error: The string must contain only 0's and 1's.")
    else:
        sol = Solution()
        result = sol.maxScore(s)
        print("Maximum Score:", result)

