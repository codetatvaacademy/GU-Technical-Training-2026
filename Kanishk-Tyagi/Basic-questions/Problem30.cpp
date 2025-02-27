// WAP to print the sum of the divisors of a number given by user.
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    int sumOfDivisior(int num){
        int sum = 0;
        for (int i = 1; i <= num;i++){
            if(num%i==0){
                sum += i;
            }
        }
            return sum;
    }
};
int main()
{
    int n;
    cin >> n;
    solution sol;
    cout<<sol.sumOfDivisior(n);
    return 0;
}