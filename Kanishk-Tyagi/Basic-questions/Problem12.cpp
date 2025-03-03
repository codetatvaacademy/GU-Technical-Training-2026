// WAP to take input 2 numbers from the user and print their difference.
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    int difference(int a, int b){
        return a - b;
    }
};
int main(){
    int a, b;
    cin >> a >> b;
    solution sol;
    cout << sol.difference(a, b);
    return 0;
}