#include <iostream>
using namespace std;

class Solution {
public:
    int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;
        int start = 1, end = x, mid = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            long long square = static_cast<long long>(mid) * mid;
            if (square > x)
                end = mid - 1;
            else if (square == x)
                return mid;
            else
                start = mid + 1;
        }
        return end;
    }
};

int main() {
    Solution solution;
    int number;

    cout << "Enter a number: ";
    cin >> number;

    int result = solution.mySqrt(number);
    cout << "The integer square root of " << number << " is " << result << "." << endl;

    return 0;
}
