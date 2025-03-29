#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

bool canFinish(vector<int>& piles, int h, int k) {
    int total_hours = 0;
    for (int pile : piles) {
        total_hours += (pile + k - 1) / k;
    }
    return total_hours <= h;
}

int minEatingSpeed(vector<int>& piles, int h) {
    int left = 1, right = *max_element(piles.begin(), piles.end());
    int result = right;

    while (left <= right) {
        int mid = (left + right) / 2;
        if (canFinish(piles, h, mid)) {
            result = mid;
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    return result;
}

int main() {
    int n, h;
    cout << "Enter the number of piles: ";
    cin >> n;

    vector<int> piles(n);
    cout << "Enter the sizes of the piles:\n";
    for (int i = 0; i < n; i++) {
        cin >> piles[i];
    }

    cout << "Enter the number of hours (h): ";
    cin >> h;

    int result = minEatingSpeed(piles, h);
    cout << "The minimum eating speed to finish all the bananas in " << h << " hours is: " << result << endl;

    return 0;
}





