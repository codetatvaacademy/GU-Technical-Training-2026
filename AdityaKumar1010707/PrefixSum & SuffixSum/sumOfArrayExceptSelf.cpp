#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int normal_product = 1;
        int zero_count = 0;
        int zero_index = -1;

        vector<int> ans(nums.size(), 0);

        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] == 0) {
                zero_count++;
                zero_index = i;
            } else {
                normal_product *= nums[i];
            }
        }

        if (zero_count == 1) {
            ans[zero_index] = normal_product;
        } else if (zero_count == 0) {
            for (int i = 0; i < nums.size(); i++) {
                ans[i] = normal_product / nums[i];
            }
        }

        return ans;
    }
};

int main() {
    int n;
    cin >> n;
    
    vector<int> nums(n);
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    Solution sol;
    vector<int> result = sol.productExceptSelf(nums);

    for (int val : result) {
        cout << val << " ";
    }
    cout << endl;

    return 0;
}
