class NumArray:

    def __init__(self, nums: List[int]):
        self.prefix=[0]
        curr=0
        for num in nums:
            curr += num
            self.prefix.append(curr)

    def sumRange(self, left: int, right: int) -> int:
        return self.prefix[right+1] - self.prefix[left]