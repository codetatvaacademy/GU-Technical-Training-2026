class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:

        maxWealth=0
        for i in range(len(accounts)):
            totalWealth=0
            for j in range(len(accounts[i])):
                totalWealth+=accounts[i][j]
            maxWealth=max(totalWealth,maxWealth)
        return maxWealth
        