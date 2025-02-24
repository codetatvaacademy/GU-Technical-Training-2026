#include <iostream>
using namespace std;

class Solution {
public:
    bool isPerfectSquare(int num) {
        int i = 1;
        while (num >= 0) {
            num -= i;
            i += 2;
            if (!num) return true;
        }
        return false;
    }
};

int main() {
    Solution solution;
    int number;

    cout << "Enter a number: ";
    cin >> number;

    if (solution.isPerfectSquare(number)) {
        cout << number << " is a perfect square." << endl;
    } else {
        cout << number << " is not a perfect square." << endl;
    }

    return 0;
}
