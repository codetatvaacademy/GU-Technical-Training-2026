class Solution:
    def numOfSubarrays(self, arr: List[int], k: int, threshold: int) -> int:
        start = 0
        end = 0
        current_sum = 0
        count = 0
        
        while end  < len(arr):
            current_sum += arr[end]
            end += 1
            if end - start == k:
                if current_sum // k >= threshold:
                    count += 1
                current_sum -= arr[start]
                start += 1
        return count




