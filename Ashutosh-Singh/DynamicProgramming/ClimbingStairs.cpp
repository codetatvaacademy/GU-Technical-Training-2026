#include <iostream>
using namespace std;

class Solution {
public:
    int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int prev = 1, curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;
    }
};

int main() {
    Solution solution;
    int n;
    cout << "Enter the number of steps: ";
    cin >> n;
    cout << "Number of ways to climb " << n << " steps: " << solution.climbStairs(n) << endl;
    return 0;
}
