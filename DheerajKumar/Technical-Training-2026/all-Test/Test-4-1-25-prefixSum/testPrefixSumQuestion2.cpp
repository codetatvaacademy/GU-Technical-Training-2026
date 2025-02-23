/*

1109

In the bustling town of Flytown, a new airline company has introduced a unique booking
system to manage its flight reservations. The town's people, excited about the new
service, start reserving seats for different flights. However, the airline faces a small
challenge—they need to calculate the total number of seats reserved for each flight
efficiently.
Here’s how the system works:
1. There are n flights labeled from 1 to n.
2. Customers make reservations for flights in ranges, where:
○ Each booking specifies a starting flight (firsti) and an ending flight (lasti).
○ For all flights between firsti and lasti (inclusive), the same number of
seats (seatsi) is reserved.
The airline now needs to calculate the total seats reserved for each flight.
Input:
The airline provides:
1. n: The total number of flights.
2. bookings: A list of bookings, where each booking is represented as
[firsti,lasti,seatsi]
Output:
The airline requires:
● An array answer of length n, where answer[i] represents the total number of
seats reserved for flight iii (1-based index).
Example 1:
Input:
n=5
bookings=[[1,2,10],[2,3,20],[2,5,25]]
Output:
[10,55,45,25,25]
Explanation:
● For flight 1: 10 seats are reserved.
● For flight 2: 10+20+25=55 seats are reserved.
● For flight 3: 20+25=45 seats are reserved.
● For flight 4: 25 seats are reserved.
● For flight 5: 25 seats are reserved.
Example 2:
Input:
n=3
bookings=[[1,3,5],[2,2,10]]
Output:
[5,15,5]
Explanation:
● For flight 1: 5 seats are reserved.
● For flight 2: 5+10=15 seats are reserved.
● For flight 3: 5 seats are reserved.
Constraints:
1 <= n <= 2 * 10^4
1 <= bookings.length <= 2 * 10^4
bookings[i].length == 3
1 <= firsti <= lasti <= n
1 <= seatsi <= 10^4
*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    vector<int> corpFlightBookings(vector<vector<int>>& bookings, int n) {
        int size = bookings.size();
        vector<int> prefixSum(n + 1, 0);

        for(int i = 0; i < size; i++){
            prefixSum[(bookings[i][0] - 1)] += bookings[i][2];
            prefixSum[bookings[i][1]] -= bookings[i][2];
        }

        for(int i = 1; i < n; i++){
            if(i == n){
                return prefixSum;
            }
            prefixSum[i] += prefixSum[i-1]; 
        }
        prefixSum.pop_back();
        return prefixSum;
    }
};

int main(){
    Solution test1;
    
    vector<vector<int>> booking = {{1,2,10},{2,3,20},{2,5,25}}, booking2 = {{1,3,5},{2,2,10}};
    vector<int> result = test1.corpFlightBookings(booking, 5);

    cout<<"\n\t{ ";
    for(auto x : result){
        cout<<x<<", ";
    }
    cout<<"}";

    result = test1.corpFlightBookings(booking2, 3);

    cout<<"\n\t{ ";
    for(auto x : result){
        cout<<x<<", ";
    }
    cout<<"}";
}