#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int countNegatives(vector<vector<int>>& grid) {
        int m = grid.size();
        int n = grid[0].size();
        int cnt = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] < 0) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
};

int main() {
    int m, n;
    cout << "Enter the number of rows in the grid: ";
    cin >> m;
    cout << "Enter the number of columns in the grid: ";
    cin >> n;
    
    vector<vector<int>> grid(m, vector<int>(n));

    cout << "Enter the elements of the grid: \n";
    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            cin >> grid[i][j];
        }
    }

    Solution solution;
    int result = solution.countNegatives(grid);

    cout << "The number of negative numbers in the grid is: " << result << endl;

    return 0;
}
