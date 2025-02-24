#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    int findDays(vector<int> arr, int mid) {
        int weightPossible = 0;
        int days = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (weightPossible + arr[i] > mid) {
                days++;
                weightPossible = arr[i];
            } else {
                weightPossible += arr[i];
            }
        }
        return days;
    }

    int shipWithinDays(vector<int>& weights, int days) {
        int start = *max_element(weights.begin(), weights.end());
        int end = 0;
        for (auto x : weights) {
            end += x;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int NoOfDays = findDays(weights, mid);
            if (NoOfDays <= days) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
};

int main() {
    Solution solution;
    int n, days;

    cout << "Enter the number of packages: ";
    cin >> n;

    vector<int> weights(n);
    cout << "Enter the weights of the packages: ";
    for (int i = 0; i < n; i++) {
        cin >> weights[i];
    }

    cout << "Enter the number of days to deliver: ";
    cin >> days;

    int result = solution.shipWithinDays(weights, days);
    cout << "The minimum capacity of the ship to deliver within " << days << " days is: " << result << endl;

    return 0;
}
