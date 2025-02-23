#include<iostream>
#include<vector>
using namespace std;

vector<int> output;
int flightReservations(vector<int>& bookings){
    //n -> no. of flights
    output.push_back(bookings[0]);
    for(int i=0;i<bookings.size();i++){
        output.push_back(output[i-1]-bookings[i]);
    }


int ranges(int firsti, int lasti){
    if(firsti==0){
        return output[lasti];
    }
     return output[lasti]-output[firsti-1];
    }
}

// TC -> O(N)
// SC -> O(1)
