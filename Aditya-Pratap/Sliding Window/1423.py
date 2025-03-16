class Solution:
    def maxScore(self, cardPoints: List[int], k: int) -> int:
        if len(cardPoints)==k:
            return sum(cardPoints)

        checkSum=sum(cardPoints[:k])
        maxSum=checkSum
        j=len(cardPoints)-1
        i=k-1
        while i>-1:
            checkSum += cardPoints[j]-cardPoints[i]
            i -=1
            j -=1
            maxSum=max(checkSum,maxSum)
        return maxSum
