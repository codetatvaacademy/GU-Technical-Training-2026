#include <iostream>
#include <vector>
#include <limits.h>  // For INT_MIN

using namespace std;

class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int current_alt = 0;
        int highest_point = 0;  
        for (int change : gain) {
            current_alt += change;
            highest_point = max(highest_point, current_alt);
        }

        return highest_point;
    }
};

int main() {
    int n;
    cout << "Enter the number of altitude changes: ";
    cin >> n;

    vector<int> gain(n);
    cout << "Enter the altitude changes: ";
    for (int i = 0; i < n; i++) {
        cin >> gain[i];
    }

    Solution obj;
    int maxAltitude = obj.largestAltitude(gain);

    cout << "The highest altitude reached is: " << maxAltitude << endl;

    return 0;
}
