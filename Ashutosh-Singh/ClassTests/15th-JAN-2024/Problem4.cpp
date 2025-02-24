#include <iostream>
#include <vector>
#include <algorithm>
#include <climits>

using namespace std;

bool canRepairAllCarsInTime(const vector<int>& ranks, int cars, long long time) {
    long long totalCarsRepaired = 0;
    for (int rank : ranks) {
        totalCarsRepaired += static_cast<long long>(sqrt(time / rank));
        if (totalCarsRepaired >= cars) {
            return true;
        }
    }
    return false;
}

long long minTimeToRepairAllCars(const vector<int>& ranks, int cars) {
    long long left = 1, right = LLONG_MAX, result = LLONG_MAX;
    while (left <= right) {
        long long mid = left + (right - left) / 2;
        if (canRepairAllCarsInTime(ranks, cars, mid)) {
            result = mid;
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    return result;
}

int main() {
    vector<int> ranks = {4, 2, 3, 1};
    int cars = 10;
    cout << "Minimum time to repair all cars: " << minTimeToRepairAllCars(ranks, cars) << " minutes" << endl;

    ranks = {5, 1, 8};
    cars = 6;
    cout << "Minimum time to repair all cars: " << minTimeToRepairAllCars(ranks, cars) << " minutes" << endl;

    return 0;
}