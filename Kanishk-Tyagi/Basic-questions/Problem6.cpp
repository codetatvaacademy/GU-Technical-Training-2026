// WAP to take input 3 digit numbers from the user and print sum of 1 and 3 digit.
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    int sumofOneandThree(int a, int b, int c){
        return a + c;
    }
};
int main(){
    int a, b, c;
    cin >> a >> b >> c;
    solution sol;
    cout << sol.sumofOneandThree(a, b,c);
}