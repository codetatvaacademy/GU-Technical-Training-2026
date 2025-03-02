class Solution:
    def minSwaps(self, nums: List[int]) -> int:
        total_ones = nums.count(1)
        n = len(nums)
        
        if total_ones == 0 or total_ones == n:
            return 0
        
        swap_min = float('inf')
        start = 0
        end = total_ones - 1
        
        # Calculate the initial count of ones in the window
        curr_ones = 0
        for i in range(start, end + 1):
            curr_ones += nums[i]
        
        for i in range(n):
            swap = total_ones - curr_ones
            swap_min = min(swap, swap_min)
            
            # Slide the window to the right
            if nums[start % n] == 1:
                curr_ones -= 1  # Remove leftmost element from window
            if nums[(end + 1) % n] == 1:
                curr_ones += 1  # Add rightmost element to window
            
            start += 1
            end += 1
       
        return swap_min
