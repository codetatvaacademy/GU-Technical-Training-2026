#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    int minStartValue(vector<int>& nums) {
        int n = nums.size();
        vector<int> prefix(n);
        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        
        int ans = *min_element(prefix.begin(), prefix.end());

        if (ans < 0) {
            return (-ans) + 1;
        }
        return 1;
    }
};

int main() {
    vector<int> nums = {-3, 2, -3, 4, 2};
    Solution solution;
    int result = solution.minStartValue(nums);
    cout << "Minimum start value: " << result << endl; 

    return 0;
}
