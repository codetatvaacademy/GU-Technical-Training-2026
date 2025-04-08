#include <iostream>
#include <bitset>

using namespace std;

class Solution{
    public:
    void canDivideEvenly(int totalSize){
        bitset<32> bitConversion(totalSize);

        if(totalSize > 2 && bitConversion[0] == 0){
            cout<<"YES";
            return;
        }
        cout<<"NO";
    }
};

int main(){
    int totalSize = 0;
    cin>>totalSize;

    Solution testcase;
    testcase.canDivideEvenly(totalSize);
    return 0;
}