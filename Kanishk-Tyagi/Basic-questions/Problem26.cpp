// WAP to input a lower limit and an upper limit from user and print all the numbers in between the given limits.
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    void printnumbers(int lower, int higher){
        for (int i = lower; i <= higher; i++)
        {
            cout << i << " ";
        }
    }
};
int main(){
    solution sol;
    int lower, higher;
    cin >> lower >> higher;
    sol.printnumbers(lower, higher);
    return 0;
}