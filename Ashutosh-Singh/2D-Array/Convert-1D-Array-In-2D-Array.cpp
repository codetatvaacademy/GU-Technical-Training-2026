#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    vector<vector<int>> construct2DArray(vector<int>& original, int m, int n) {
        int size = original.size();
        vector<vector<int>> result;
        vector<int> cells;
        if (size != m * n) {
            return result; // Return empty vector if the dimensions don't match
        }

        for(int i = 0; i < size; i++) {
            cells.push_back(original[i]);
            if(cells.size() == n) {
                result.push_back(cells);
                cells.clear(); // Clear the cells vector after adding it to the result
            }
        }
        return result;
    }
};

int main() {
    Solution solution;
    
    int m, n;
    cout << "Enter the number of rows (m): ";
    cin >> m;
    cout << "Enter the number of columns (n): ";
    cin >> n;

    vector<int> original;
    cout << "Enter " << m * n << " elements for the original array: ";
    for (int i = 0; i < m * n; i++) {
        int temp;
        cin >> temp;
        original.push_back(temp);
    }

    vector<vector<int>> result = solution.construct2DArray(original, m, n);

    // Output the result
    if (result.empty()) {
        cout << "The array cannot be converted into a " << m << "x" << n << " 2D array." << endl;
    } else {
        for (auto& row : result) {
            for (int val : row) {
                cout << val << " ";
            }
            cout << endl;
        }
    }

    return 0;
}
