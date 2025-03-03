#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>
using namespace std;

bool canRepairAll(vector<int>& ranks, int cars, long long time) {
    long long totalCars = 0;
    for (int rank : ranks) {
        totalCars += static_cast<long long>(sqrt(time / rank));
        if (totalCars >= cars) return true;
    }
    return false;
}

int minTimeToRepair(vector<int>& ranks, int cars) {
    long long left = 1, right = *max_element(ranks.begin(), ranks.end()) * (long long)cars * cars, result = right;

    while (left <= right) {
        long long mid = left + (right - left) / 2;
        if (canRepairAll(ranks, cars, mid)) {
            result = mid;
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }

    return result;
}

int main() {
    int n, cars;
    cout << "Enter the number of mechanics: ";
    cin >> n;

    vector<int> ranks(n);
    cout << "Enter the ranks of the mechanics:\n";
    for (int i = 0; i < n; i++) {
        cin >> ranks[i];
    }

    cout << "Enter the number of cars: ";
    cin >> cars;

    int result = minTimeToRepair(ranks, cars);
    cout << "The minimum time to repair all cars is: " << result << endl;

    return 0;
}




// SPACE COMPLEXITY OF FUNCTION : O(1)


// TIME COMPLEXITY OVERALL CODE = O(n * log k)
// // SPACE COMPLEXITY OVERALL CODE = O(1)