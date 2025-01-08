#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    int maxSatisfied(vector<int>& customers, vector<int>& grumpy, int minutes) {
        int n = customers.size();
        int unsatCus = 0;

        for(int i = 0; i < minutes; i++) {
            if(grumpy[i] == 1) {
                unsatCus += customers[i];
            }
        }

        int i = 0;
        int j = minutes;
        int maxUnsatCus = unsatCus;

        while(j < n) {
            if(grumpy[j] == 1) {
                unsatCus += customers[j];
            }
            if(grumpy[i] == 1) {
                unsatCus -= customers[i];
            }
            maxUnsatCus = max(maxUnsatCus, unsatCus);

            i++;
            j++;
        }

        int totalUnsatCus = maxUnsatCus;
        for(int k = 0; k < n; k++) {
            if(grumpy[k] == 0) {
                totalUnsatCus += customers[k];
            }
        }

        return totalUnsatCus;
    }
};

int main() {
    Solution solution;

    // Test case
    vector<int> customers = {1, 0, 1, 2, 1, 1, 7, 5};
    vector<int> grumpy =    {0, 1, 0, 1, 0, 1, 0, 1};
    int minutes = 3;

    int result = solution.maxSatisfied(customers, grumpy, minutes);

    cout << "Maximum number of satisfied customers: " << result << endl;

    return 0;
}
