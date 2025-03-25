#include <iostream>
#include <vector>
using namespace std; 

class Solution {
public:
    vector<int> corpFlightBookings(vector<vector<int>>& bookings, int n) {
        vector<int> ans(n, 0);
    
        for (auto& booking : bookings) {
            int start = booking[0] - 1;
            int end = booking[1] - 1;   
            int seatRes = booking[2];
            ans[start] += seatRes; 
            if (end + 1 < n) {
                ans[end + 1] -= seatRes; 
            }
        }

        for(int i=1; i<n; i++) {
            ans[i]+=ans[i-1];
        }
        return ans;
    }
};

int main() {
    Solution sol;
    int n = 5; 
    vector<vector<int>> bookings = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
    vector<int> result = sol.corpFlightBookings(bookings, n);

    for(int seats : result) {
        cout << seats << " ";
    }
   
}
