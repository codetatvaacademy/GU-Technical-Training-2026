class Solution:
    def maxSumRangeQuery(self, nums: List[int], requests: List[List[int]]) -> int:
        freq = [0] * (len(nums)+1)

        for start, end in requests:
            freq[start] += 1
            freq[end+1] -= 1
        
        prefix = [0] * len(nums)
        prefix[0] = freq[0]

        for i in range(1,len(nums)):
            prefix[i] = prefix[i-1] + freq[i]
        
        prefix.sort()
        nums.sort()
        summ = 0 

        for i in range(len(nums)):
            summ += (nums[i] * prefix[i]) % (10**9 + 7)

        return summ % (10**9 + 7)