#include <iostream>
#include <vector>
using namespace std;

int main()
{
    int n = 5;
    vector<int> flights(n, 0);
    vector<vector<int>> bookings{{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
    vector<int> result(n,0);
    
    for(int i =0;i<bookings.size();i++){
        result[bookings[i][0] -1] += bookings[i][2];
        if(bookings[i][1]<n) {
            result[bookings[i][1] -= bookings[i][2]];
        }
    }

    for(int i =1;i<n;i++){
        result[i] += result[i-1];
    }
    return result;
}

