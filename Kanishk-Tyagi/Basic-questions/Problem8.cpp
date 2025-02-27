// WAP to take input 4 digit numbers from the user and print its all digits.
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    void print(int a, int b, int c, int d){
        cout << a << endl;
        cout << b << endl;
        cout << c << endl;
        cout << d << endl;
        }
};
int main(){
    solution sol;
    int a, b, c, d;
    cin >> a >> b >> c >> d;
    sol.print(a, b, c, d);
    return 0;
}