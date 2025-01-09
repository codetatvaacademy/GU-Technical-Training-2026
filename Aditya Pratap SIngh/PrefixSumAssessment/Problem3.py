class NumMatrix:
    def __init__(self, matrix):
        if not matrix:
            return

        m=len(matrix)
        n=len(matrix[0])
        self.prefix= [[0] * (n + 1) for _ in range(m + 1)]#empty matrix of same size

        for i in range(m):
            for j in range(n):
                self.prefix[i + 1][j + 1] = (matrix[i][j] + self.prefix[i][j + 1] +
                                             self.prefix[i + 1][j] - self.prefix[i][j])

    def sumRegion(self, row1, col1, row2, col2):
        return (self.prefix[row2 + 1][col2 + 1] - self.prefix[row1][col2 + 1] - self.prefix[row2 + 1][col1] + self.prefix[row1][col1])

# Input operations
operations= ["NumMatrix", "sumRegion", "sumRegion", "sumRegion"]
inputs= [[[[3, 0, 1, 4, 2],
            [5, 6, 3, 2, 1],
            [1, 2, 0, 1, 5],
            [4, 1, 0, 1, 7],
            [1, 0, 3, 0, 5]]], 
          [2, 1, 4, 3], 
          [1, 1, 2, 2], 
          [1, 2, 2, 4]]


methods= {"NumMatrix": lambda inp: NumMatrix(*inp),
    "sumRegion": lambda inp: num_matrix.sumRegion(*inp)}

result=[]
num_matrix = None

for op, inp in zip(operations, inputs):
    if op=="NumMatrix":
        num_matrix= methods[op](inp)
        result.append(None)
    else:
        result.append(methods[op](inp))

print(result)
