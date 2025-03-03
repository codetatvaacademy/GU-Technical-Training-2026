#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int maxSatisfied(vector<int>& customers, vector<int>& grumpy, int minutes) {
        int n = customers.size();
        int unsatCus = 0;

        for (int i = 0; i < minutes; i++) {
            unsatCus += grumpy[i] * customers[i];
        }

        int st = 0;
        int end = minutes;
        int maxUnsatCus = unsatCus;

        while (end < n) {
            unsatCus += grumpy[end] * customers[end];
            unsatCus -= grumpy[st] * customers[st];
            maxUnsatCus = max(maxUnsatCus, unsatCus);
            st++;
            end++;
        }

        int maxSatCus = maxUnsatCus;
        for (int k = 0; k < n; k++) {
            maxSatCus += (1 - grumpy[k]) * customers[k];
        }

        return maxSatCus;
    }
};

int main() {
    int n, minutes;
    cin >> n >> minutes;

    vector<int> customers(n);
    vector<int> grumpy(n);

    for (int i = 0; i < n; i++) {
        cin >> customers[i];
    }

    for (int i = 0; i < n; i++) {
        cin >> grumpy[i];
    }

    Solution solution;
    cout << solution.maxSatisfied(customers, grumpy, minutes) << endl;

    return 0;
}
