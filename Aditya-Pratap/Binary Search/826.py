class Solution:
    def maxProfitAssignment(self, difficulty: List[int], profit: List[int], worker: List[int]) -> int:
        max_difficulty = max(difficulty)
        
      
        arr = [0] * (max_difficulty + 1)


        for d, p in zip(difficulty, profit):
            if p > arr[d]:
                arr[d] = p
        
     
        for i in range(1, len(arr)):
            arr[i] = max(arr[i], arr[i - 1])
      
        total_profit = 0
        for w in worker:
            if w <= max_difficulty:
                total_profit += arr[w]
        
        return total_profit