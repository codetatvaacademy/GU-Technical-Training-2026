#include <iostream>
#include <vector>

using namespace std;

class Solution
{
public:
    vector<int> corpFlightBookings(vector<vector<int>> &bookings, int n)
    {
        vector<int> diff(n + 1, 0);

        for (const auto &booking : bookings)
        {
            int first = booking[0];
            int last = booking[1];
            int seats = booking[2];

            diff[first - 1] += seats;
            if (last < n)
            {
                diff[last] -= seats;
            }
        }

        vector<int> result(n, 0);
        int runningSum = 0;
        for (int i = 0; i < n; ++i)
        {
            runningSum += diff[i];
            result[i] = runningSum;
        }

        return result;
    }
};

int main()
{
    int n, m;

    cout << "Enter the number of flights (n): ";
    cin >> n;

    cout << "Enter the number of bookings: ";
    cin >> m;

    vector<vector<int>> bookings(m, vector<int>(3));

    cout << "Enter booking details (start, end, seats) for each booking:\n";
    for (int i = 0; i < m; ++i)
    {
        cin >> bookings[i][0] >> bookings[i][1] >> bookings[i][2];
    }

    Solution solution;

    vector<int> result = solution.corpFlightBookings(bookings, n);

    cout << "Result: ";
    for (int seats : result)
    {
        cout << seats << " ";
    }
    cout << endl;

    return 0;
}
