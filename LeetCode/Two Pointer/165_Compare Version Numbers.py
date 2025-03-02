class Solution:
    def compareVersion(self, version1: str, version2: str) -> int:
        val1, val2 = 0, 0
        i, j = 0, 0
        while i < len(version1) or j < len(version2):
            while i < len(version1) and version1[i] != '.':
                val1 = val1 * 10 + int(version1[i])
                i += 1
            while j < len(version2) and version2[j] != '.':
                val2 = val2 * 10 + int(version2[j])
                j += 1
            if val1 > val2:
                return 1
            if val1 < val2:
                return -1
            val1, val2 = 0, 0
            i += 1
            j += 1
        return 0

