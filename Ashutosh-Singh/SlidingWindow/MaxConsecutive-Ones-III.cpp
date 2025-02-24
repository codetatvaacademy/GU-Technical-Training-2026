#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int longestOnes(vector<int>& nums, int k) {
        int n = nums.size();
        int zeroCnt = 0;
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < n; ++right) {
            if (nums[right] == 0) {
                zeroCnt++;
            }
            while (zeroCnt > k) {
                if (nums[left] == 0) {
                    zeroCnt--;
                }
                left++;
            }
            maxLen = max(maxLen, right - left + 1);
        }

        return maxLen;
    }
};

int main() {
    int n, k;
    cin >> n >> k;

    vector<int> nums(n);
    for (int i = 0; i < n; ++i) {
        cin >> nums[i];
    }

    Solution solution;
    cout << solution.longestOnes(nums, k) << endl;

    return 0;
}
