class Solution:
    def platesBetweenCandles(self, s: str, queries: List[List[int]]) -> List[int]:
        n = len(s)
        prefix = [0] * n
        leftPosition = [-1] * n
        rightPosition = [-1] * n
        
        # Initialize prefix and leftPosition
        prefix[0] = 1 if s[0] == "*" else 0
        leftPosition[0] = 0 if s[0] == "|" else -1
        
        # Initialize rightPosition
        rightPosition[n - 1] = n - 1 if s[n - 1] == "|" else n
        
        for i in range(1, n):
            if s[i] == "*":
                prefix[i] = prefix[i - 1] + 1
            else:
                prefix[i] = prefix[i - 1]
            
            if s[i] == "|":
                leftPosition[i] = i
            else:
                leftPosition[i] = leftPosition[i - 1]
        
        for j in range(n - 2, -1, -1):
            if s[j] == "|":
                rightPosition[j] = j
            else:
                rightPosition[j] = rightPosition[j + 1]
        
        # Process queries
        res = [0] * len(queries)
        for i in range(len(queries)):
            start = rightPosition[queries[i][0]]
            end = leftPosition[queries[i][1]]
            if start <= end:
                res[i] = prefix[end] - prefix[start]
            else:
                res[i] = 0
        
        return res
