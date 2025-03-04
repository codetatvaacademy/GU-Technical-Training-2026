// WAP to check whether the number is positive, negative or zero.
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    void CheckNumber(int a){
        if(a==0){
            cout << "Number is zero" << endl;
        }
        else if(a<0){
            cout << "Number is negative" << endl;
        }
        else{
            cout << "Number is positive" << endl;
        }
    }
};
int main(){
    solution sol;
    int a;
    cin >> a;
    sol.CheckNumber(a);
    return 0;
}