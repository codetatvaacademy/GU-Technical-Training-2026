class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        # Helper function to check if a subgrid (3x3) is valid
        def is_valid_subgrid(subgrid):
            elements = [x for row in subgrid for x in row if x != '.']
            return len(elements) == len(set(elements))
        
        # Check rows and columns
        for i in range(9):
            row = [board[i][j] for j in range(9)]
            column = [board[j][i] for j in range(9)]
            
            if len([x for x in row if x != '.']) != len(set(x for x in row if x != '.')) or\
               len([x for x in column if x != '.']) != len(set(x for x in column if x != '.')):
                return False
        
        # Check 3x3 subgrids
        for i in range(0, 9, 3):
            for j in range(0, 9, 3):
                subgrid = [board[x][j:j+3] for x in range(i, i+3)]
                if not is_valid_subgrid(subgrid):
                    return False
                
        return True
