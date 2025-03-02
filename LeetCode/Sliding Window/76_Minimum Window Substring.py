class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if not s or not t:
            return ""

        start = 0
        end = 0
        s_index = -1
        unique = 0
        min_len = len(s) + 1

        frequency_s = [0] * 128
        frequency_t = [0] * 128

        for char in t:
            frequency_t[ord(char)] += 1

        for count in frequency_t:
            if count > 0:
                unique += 1

        while end < len(s):
            c = s[end]
            frequency_s[ord(c)] += 1

            if frequency_t[ord(c)] > 0 and frequency_s[ord(c)] == frequency_t[ord(c)]:
                unique -= 1

            while unique == 0:
                if end - start + 1 < min_len:
                    min_len = end - start + 1
                    s_index = start

                ch = s[start]
                frequency_s[ord(ch)] -= 1

                if frequency_t[ord(ch)] > 0 and frequency_s[ord(ch)] < frequency_t[ord(ch)]:
                    unique += 1

                start += 1

            end += 1

        return "" if s_index == -1 else s[s_index:s_index + min_len]

