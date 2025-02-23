class Solution:
    def numOfSubarrays(self, arr: List[int], k: int, threshold: int) -> int:
        th = threshold * k 

        res = 0
        # for i in range(k):
        #     avg += arr[i]
        avg=sum(arr[:k])
        if avg >= th:
            res += 1

        for i in range(k, len(arr)):
            avg -= arr[i-k]
            avg += arr[i]
            if avg >= th:
                res += 1

        return res