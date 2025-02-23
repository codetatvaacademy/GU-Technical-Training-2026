#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int sum = 0;
        for (int it : nums) {
            sum += it;
        }

        int size = nums.size();
        int l_sum = 0;
        int r_sum = sum;
        int bal_index = -1;

        for (int i = 0; i < size; i++) {
            r_sum = sum - l_sum - nums[i];
            if (l_sum == r_sum) {
                bal_index = i;
                break;
            } else {
                l_sum += nums[i];
            }
        }

        return bal_index;
    }
};

int main() {
    int n;
    cout << "Enter number of elements: ";
    cin >> n;

    vector<int> nums(n);
    cout << "Enter elements: ";
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    Solution obj;
    int result = obj.pivotIndex(nums);

    cout << "Pivot Index: " << result << endl;

    return 0;
}
