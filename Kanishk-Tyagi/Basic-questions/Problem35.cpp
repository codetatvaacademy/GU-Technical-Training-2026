// WAP to take input a number from user and print in the form of series:
//1. 1, 3, 6, 10, 15, ... nth term
#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n, sum = 0;
    cin>>n;
    for (int i=1;i<=n;i++)
    {
        sum+=i;
        cout<<sum;
        if (i<n)
            cout<< ", ";
    }
    cout<<endl;
    return 0;
}
