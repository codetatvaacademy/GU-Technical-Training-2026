#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    bool isPlacement(vector<int>& position, int m, int mid) {
        int count = 1;
        int last = position[0];
        for (int i = 0; i < position.size(); i++) {
            if (position[i] - last >= mid) {
                last = position[i];
                count++;
            }
        }
        return count >= m;
    }

    int maxDistance(vector<int>& position, int m) {
        sort(position.begin(), position.end());
        int n = position.size();
        int st = 0;
        int end = position[n - 1];
        int mid;
        int optimal = 0;
        while (st <= end) {
            mid = st + (end - st) / 2;
            if (isPlacement(position, m, mid)) {
                optimal = mid;
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return optimal;
    }
};

int main() {
    Solution solution;
    int n, m;
    cout << "Enter the number of positions: ";
    cin >> n;

    vector<int> position(n);
    cout << "Enter the positions: ";
    for (int i = 0; i < n; i++) {
        cin >> position[i];
    }

    cout << "Enter the number of balls to place: ";
    cin >> m;

    int result = solution.maxDistance(position, m);
    cout << "The maximum distance between any two balls is: " << result << endl;

    return 0;
}
