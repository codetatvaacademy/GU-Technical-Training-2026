// WAP to take input 3 digit numbers from the user and print the square of the middle digit.
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    int SquareOfMiddle(int a, int b, int c){
        return b * b;
    }
    
};
    int main(){
        solution sol;
        int a, b, c;
        cin >> a >> b >> c;
        cout << sol.SquareOfMiddle(a, b, c);
        return 0;
    }