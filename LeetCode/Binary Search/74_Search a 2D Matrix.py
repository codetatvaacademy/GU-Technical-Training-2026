class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rowIndex = self.searchRow(matrix, target)
        if rowIndex != -1:
            return self.binarySearchOverRow(matrix, rowIndex, target)
        else:
            return False

    def searchRow(self, matrix, target):
        m = len(matrix)
        n = len(matrix[0])
        min_val, max_val = 0, m - 1
        while min_val <= max_val:
            mid = (min_val + max_val) // 2
            if matrix[mid][0] <= target <= matrix[mid][n-1]:
                return mid
            elif matrix[mid][0] < target:
                min_val = mid + 1
            else:
                max_val = mid - 1
        return -1

    def binarySearchOverRow(self, matrix, rowIndex, target):
        n = len(matrix[0])
        min_val, max_val = 0, n - 1
        while min_val <= max_val:
            mid = (min_val + max_val) // 2
            if matrix[rowIndex][mid] == target:
                return True
            elif matrix[rowIndex][mid] < target:
                min_val = mid + 1
            else:
                max_val = mid - 1
        return False
       