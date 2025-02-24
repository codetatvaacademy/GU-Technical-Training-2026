#include <iostream>
using namespace std;

class Solution {
public:
    int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        int prev1 = 0, prev2 = 1;
        for (int i = 2; i <= n; ++i) {
            int curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;
        }
        return prev2;
    }
};

int main() {
    Solution solution;
    int n;
    cout << "Enter the value of n: ";
    cin >> n;
    
    cout << "The " << n << "-th Fibonacci number is: " << solution.fib(n) << endl;
    return 0;
}
