class Solution:
    def checksum(self, weights: List[int], mid: int, days: int) -> bool:
        d = 1  
        s = 0  
        for weight in weights:
            if s + weight <= mid:
                s += weight
            else:
                d += 1 
                s = weight 
                if d > days:  
                    return False
        return d <= days  

    def shipWithinDays(self, weights: List[int], days: int) -> int:
        maxValue = sum(weights) 
        minValue = max(weights)  
        
        while minValue < maxValue:
            mid = (minValue + maxValue) // 2
            if self.checksum(weights, mid, days):
                maxValue = mid  
            else:
                minValue = mid + 1  
                
        return minValue