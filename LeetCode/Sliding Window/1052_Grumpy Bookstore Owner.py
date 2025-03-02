class Solution:
    def maxSatisfied(self, customers: List[int], grumpy: List[int], minutes: int) -> int:
        n = len(customers)
        start = 0
        end = minutes  # The window should be of size 'minutes'
        unsatisfied = 0
        maxValue = 0
        maxMinutes = 0

        # Calculate always satisfied customers
        for i in range(n):
            if grumpy[i] == 0:
                maxMinutes += customers[i]

        # Calculate initial unsatisfied customers in the first window
        for i in range(start, end):
            if grumpy[i] == 1:
                unsatisfied += customers[i]
        maxValue = unsatisfied  # Store the maximum value found

        # Slide the window across the array
        while end < n:
            if grumpy[end] == 1:  # Add new rightmost element if it's grumpy
                unsatisfied += customers[end]
            if grumpy[start] == 1:  # Remove leftmost element if it was grumpy
                unsatisfied -= customers[start]

            maxValue = max(maxValue, unsatisfied)  # Update maxValue

            start += 1
            end += 1  

        return maxMinutes + maxValue
