class Solution:
    def minimumSize(self, nums: List[int], maxOperations: int) -> int:
        maximum=max(nums)
        minimum=1
        while minimum<=maximum:
            mid=(minimum+maximum)//2
            if self.isPossible(nums, mid, maxOperations):
                maximum= mid-1
            else: 
                minimum= mid+1
        return minimum

    def isPossible(self, nums: List[int], maxBalls: int, maxOperations: int) -> bool:
        for num in nums:
            maxOperations-=(num-1)//maxBalls
            if maxOperations<0:
                return False
        return True

        