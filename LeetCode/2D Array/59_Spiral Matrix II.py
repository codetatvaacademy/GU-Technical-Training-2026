class Solution:
    def generateMatrix(self, n: int) -> List[List[int]]:
        # Initialize an empty n x n matrix with zeroes
        matrix = [[0] * n for _ in range(n)]
        
        # Set the initial boundaries for the spiral
        left, right = 0, n - 1
        top, bottom = 0, n - 1
        current_number = 1  # The starting number to fill the matrix with
        
        # Continue the spiral until we reach n^2
        while current_number <= n * n:
            
            # Traverse from left to right in the top boundary
            for i in range(left, right + 1):
                matrix[top][i] = current_number
                current_number += 1
            top += 1
            
            # Traverse from top to bottom in the right boundary
            for i in range(top, bottom + 1):
                matrix[i][right] = current_number
                current_number += 1
            right -= 1
            
            # Traverse from right to left in the bottom boundary
            for i in range(right, left - 1, -1):
                matrix[bottom][i] = current_number
                current_number += 1
            bottom -= 1
            
            # Traverse from bottom to top in the left boundary
            for i in range(bottom, top - 1, -1):
                matrix[i][left] = current_number
                current_number += 1
            left += 1
        
        return matrix
