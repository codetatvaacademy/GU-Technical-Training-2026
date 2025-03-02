class Solution:
    def maxProfitAssignment(self, difficulty: List[int], profit: List[int], worker: List[int]) -> int:
        maxP = 0
        arr = [[difficulty[i], profit[i]] for i in range(len(profit))]

        arr.sort(key=lambda x: x[0])
        for i in range(1, len(arr)):
            arr[i][1] = max(arr[i][1], arr[i-1][1])

        for w in worker:
            index = self.binarySearch(arr, w)
            maxP += 0 if index == -1 else arr[index][1]

        return maxP

    def binarySearch(self, arr, searchEl):
        start, end = 0, len(arr) - 1
        while start <= end:
            mid = (start + end) // 2
            if arr[mid][0] <= searchEl:
                start = mid + 1
            else:
                end = mid - 1
        return end
        

        