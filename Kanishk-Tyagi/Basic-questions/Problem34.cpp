#include <bits/stdc++.h>
using namespace std;

class solution
{
public:
    bool armstrong_Number(int n)
    {
        int originalNum = n, sum = 0, digits = 0, temp = n;
        while (temp>0)
        {
            temp /= 10;
            digits++;
        }
        temp = n;
        while (temp>0)
        {
            int digit = temp % 10;
            sum += pow(digit,digits);
            temp /= 10;
        }
        return sum == originalNum;
    }
};

int main()
{
    int n;
    cin >> n;
    solution obj;
    cout << (obj.armstrong_Number(n)?"Yes" : "No") <<endl;
    return 0;
}
