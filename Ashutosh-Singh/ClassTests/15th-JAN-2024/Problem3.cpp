#include <iostream>
#include <vector>
#include <cmath>
#include <algorithm>
using namespace std;

class Solution {
public:
    bool isPossible(vector<int>& ranks, long long mid, int cars) {
        long long count = 0;
        for (int rank : ranks) {
            count += sqrt(mid / rank);
            if (count >= cars) {
                return true;
            }
        }
        return count >= cars;
    }

    long long MechanicTime(vector<int>& ranks, int cars) {
        int r_min = *min_element(ranks.begin(), ranks.end());
        long long left = 1, right = static_cast<long long>(r_min) * cars * cars;
        long long result = right;

        while (left <= right) {
            long long mid = left + (right - left) / 2;
            if (isPossible(ranks, mid, cars)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
};

int main() {
    int n, cars;
    cout << "Enter the number of mechanics: ";
    cin >> n;
    vector<int> ranks(n);

    cout << "Enter the ranks of the mechanics: ";
    for (int i = 0; i < n; ++i) {
        cin >> ranks[i];
    }

    cout << "Enter the number of cars: ";
    cin >> cars;

    Solution solution;
    long long result = solution.MechanicTime(ranks, cars);
    cout << "Minimum time to repair all cars: " << result << endl;

    return 0;
}
