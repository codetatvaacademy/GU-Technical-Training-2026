#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    void printreverse(int num){
        string str = to_string(num);
        reverse(str.begin(), str.end());
        cout << str << endl;
    }
};
int main(){
    int num;
    cin >> num;
    solution sol;
    sol.printreverse(num);
}