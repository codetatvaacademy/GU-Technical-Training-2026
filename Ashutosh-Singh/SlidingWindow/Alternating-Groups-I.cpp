#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int numberOfAlternatingGroups(vector<int>& colors) {
        int n = colors.size();
        int count = 0;

        for (int i = 0; i < n; ++i) {
            int prev = colors[(i - 1 + n) % n];
            int curr = colors[i];
            int next = colors[(i + 1) % n];

            if (prev != curr && curr != next && prev == next) {
                ++count;
            }
        }

        return count;
    }
};

int main() {
    int n;
    cin >> n;
    vector<int> colors(n);

    for (int i = 0; i < n; ++i) {
        cin >> colors[i];
    }

    Solution solution;
    cout << solution.numberOfAlternatingGroups(colors) << endl;

    return 0;
}
