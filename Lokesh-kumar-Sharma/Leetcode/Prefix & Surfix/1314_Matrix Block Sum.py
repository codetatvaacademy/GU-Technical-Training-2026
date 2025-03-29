class Solution:
    def matrixBlockSum(self, mat: List[List[int]], K: int) -> List[List[int]]:
        m, n = len(mat), len(mat[0])
        answer = [[0] * n for _ in range(m)]
        prefix_sum = [[0] * (n + 1) for _ in range(m + 1)]
        for i in range(m):
            for j in range(n):
                prefix_sum[i + 1][j + 1] = mat[i][j] + prefix_sum[i + 1][j] + prefix_sum[i][j + 1] - prefix_sum[i][j]
        for i in range(m):
            for j in range(n):
                r1 = max(0, i - K)
                c1 = max(0, j - K)
                r2 = min(m - 1, i + K)
                c2 = min(n - 1, j + K)
                answer[i][j] = prefix_sum[r2 + 1][c2 + 1] - prefix_sum[r1][c2 + 1] - prefix_sum[r2 + 1][c1] + prefix_sum[r1][c1]
        return answer


def take_input():
    # Input matrix dimensions
    m = int(input("Enter the number of rows in the matrix: "))
    n = int(input("Enter the number of columns in the matrix: "))

    # Input matrix elements
    mat = []
    for i in range(m):
        row = list(map(int, input(f"Enter the elements of row {i + 1} separated by spaces: ").split()))
        mat.append(row)
    
    # Input K value
    K = int(input("Enter the value of K: "))
    
    return mat, K

# Get user input
mat, K = take_input()

solution = Solution()
output = solution.matrixBlockSum(mat, K)

print("The block sum matrix is:")
for row in output:
    print(" ".join(map(str, row)))
