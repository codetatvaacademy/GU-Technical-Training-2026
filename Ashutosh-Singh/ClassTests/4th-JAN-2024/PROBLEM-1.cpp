#include <iostream>
#include <vector>
using namespace std;

class Solution
{
public:
    int pivotIndex(vector<int> &nums)
    {
        int n = nums.size();
        int TotalSum = 0;
        for (int i = 0; i < n; i++)
        {
            TotalSum += nums[i];
        }

        int leftSum = 0;
        int rightSum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum += nums[i];
            leftSum = sum - nums[i];
            rightSum = TotalSum - sum;
            if (leftSum == rightSum)
            {
                return i;
            }
        }
        return -1;
    }
};

int main() {
    int n;
    cout << "Enter the number of elements in the array: ";
    cin >> n;

    vector<int> nums(n);
    cout << "Enter the elements of the array:\n";
    for (int i = 0; i < n; ++i) {
        cin >> nums[i];
    }

    
    Solution solution;
    int pivot = solution.pivotIndex(nums);

    if (pivot != -1) {
        cout << "Pivot Index: " << pivot << endl;
    } else {
        cout << "No Pivot Index found." << endl;
    }

    return 0;
}
