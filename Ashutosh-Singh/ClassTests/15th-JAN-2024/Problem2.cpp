#include <iostream>
#include <vector>
#include <climits>
using namespace std;

class Solution {
public:
    bool isPossible(vector<int>& pile, int h, int mid) {
        int time = 0;
        for (int i = 0; i < pile.size(); ++i) {
            // ceil(pile[i] / mid)
            time += (pile[i] + mid - 1) / mid;
        }
        return time <= h;
    }
    
    int minSpeed(vector<int>& pile, int h) {
        int low = 1;
        int high = INT_MIN;
        
        // Find the maximum pile size
        for(auto x : pile){
            high = max(x, high);
        }
        
        int val = 0;
        while(low < high) {
            int mid = (low + high) / 2;
            //check if it is possible to eat all the bananas in h hours
            if (isPossible(pile, h, mid)) {
                val = mid;
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
};

int main() {
    int n, h;
    
    cout << "Enter number of pile: ";
    cin >> n;
    
    vector<int> pile(n);
    
    cout << "Enter the number of bananas in each pile: ";
    for (int i = 0; i < n; ++i) {
        cin >> pile[i];
    }
    
    cout << "Enter the number of hours: ";
    cin >> h;
    
    Solution sol;
    int result = sol.minSpeed(pile, h);
    
    cout << "Minimum eating speed: " << result << endl;
    
    return 0;
}
