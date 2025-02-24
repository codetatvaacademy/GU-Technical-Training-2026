class Solution:
    def maxIceCream(self, costs: List[int], coins: int) -> int:
        costs=sorted(costs)
        count=0
        if costs[0]>coins:
            return 0
        for i in range(len(costs)):
            if coins-costs[i]>=0:
                count+=1
                coins-=costs[i]
            else:
                break
        return count