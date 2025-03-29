// WAP to input a lower limit and an upper limit from user and print all the even numbers in between the given limits.

#include <bits/stdc++.h>
using namespace std;
class solution
{
public:
    void printnumbers(int lower, int higher)
    {
        for (int i = lower; i <= higher; i++)
        {
            if(i%2==0){
            cout << i << " ";
        }
    }
    }
};
int main()
{
    solution sol;
    int lower, higher;
    cin >> lower >> higher;
    sol.printnumbers(lower, higher);
    return 0;
}