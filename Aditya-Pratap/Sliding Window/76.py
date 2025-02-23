class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if not t:
            return ""

        char_counts, window = {}, {}
        for char in t:
            char_counts[char] = 1 + char_counts.get(char, 0)

        matched, required = 0, len(char_counts)
        left, right = 0, 0
        result, result_length = [-1, -1], float("inf")

        for right in range(len(s)):
            char = s[right]
            window[char] = 1 + window.get(char, 0)

            if char in char_counts and window[char] == char_counts[char]:
                matched += 1

            while matched == required:
                if (right - left + 1) < result_length:
                    result = [left, right]
                    result_length = (right - left + 1)

                window[s[left]] -= 1
                if s[left] in char_counts and window[s[left]] < char_counts[s[left]]:
                    matched -= 1
                left += 1

        if result_length != float("inf"):
            return s[result[0]:result[1] + 1]
        else:
            return ""