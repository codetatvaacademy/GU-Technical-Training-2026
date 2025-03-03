#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    long long findAvailablePower(long long val, vector<int>& batt) {
        long long sum = 0;
        for (auto x : batt) {
            sum += (x > val) ? val : x;
        }
        return sum;
    }

    long long maxRunTime(int n, vector<int>& batt) {
        long long min = 1;  // Minimum possible runtime
        long long max = 0;  // Total power from all batteries

        for (auto x : batt) {
            max += x;
        }

        long long result = 0;

        while (min <= max) {
            long long mid = (min + max) / 2;
            long long requiredPower = n * mid;

            long long availablePower = findAvailablePower(mid, batt);

            if (availablePower >= requiredPower) {
                result = mid;  // Update result to the current valid mid
                min = mid + 1; // Try for a larger runtime
            } else {
                max = mid - 1; // Reduce runtime range
            }
        }

        return result;
    }
};

int main() {
    int n, m;

    cout << "Enter the number of devices (n): ";
    cin >> n;

    cout << "Enter the number of batteries available: ";
    cin >> m;

    vector<int> batteries(m);
    cout << "Enter the power capacities of the batteries: ";
    for (int i = 0; i < m; i++) {
        cin >> batteries[i];
    }

    Solution solution;
    long long result = solution.maxRunTime(n, batteries);

    cout << "Maximum runtime for " << n << " devices is: " << result << " hours." << endl;

    return 0;
}
