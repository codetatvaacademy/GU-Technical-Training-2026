#include <iostream>
#include <vector>
#include <climits>
using namespace std;

class Solution {
public:
    bool possible(vector<int>& bloomDay, int Day, int m, int k) {
        int cnt = 0;
        int noOfB = 0;
        for (int i = 0; i < bloomDay.size(); i++) {
            if (bloomDay[i] <= Day) {
                cnt++;
            } else {
                noOfB += (cnt / k);
                cnt = 0;
            }
        }
        noOfB += cnt / k;
        return noOfB >= m;
    }

    int minDays(vector<int>& bloomDay, int m, int k) {
        long long int val = m * 1LL * k * 1LL;
        if (val > bloomDay.size()) return -1;
        int start = INT_MAX;
        int end = INT_MIN;
        for (auto x : bloomDay) {
            start = min(start, x);
            end = max(end, x);
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (possible(bloomDay, mid, m, k)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
};

int main() {
    int n, m, k;

    cout << "Enter the number of bloom days (size of bloomDay array): ";
    cin >> n;

    vector<int> bloomDay(n);
    cout << "Enter the bloom days: ";
    for (int i = 0; i < n; i++) {
        cin >> bloomDay[i];
    }

    cout << "Enter the number of bouquets (m): ";
    cin >> m;

    cout << "Enter the number of flowers required per bouquet (k): ";
    cin >> k;

    Solution solution;
    int result = solution.minDays(bloomDay, m, k);

    if (result == -1) {
        cout << "It is not possible to make " << m << " bouquets with " << k << " flowers each.\n";
    } else {
        cout << "The minimum number of days required to make " << m << " bouquets is: " << result << endl;
    }

    return 0;
}
