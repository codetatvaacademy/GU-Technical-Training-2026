// WAP to check whether a number is even or odd.
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    void evenOrodd(int a){
           if(a%2==0){
               cout << "Number is Even";
           }
           else{
               cout << "Number is Odd";
           }
    }
};
int main(){
    solution sol;
    int a;
    cin >> a;
    sol.evenOrodd(a);
    return 0;
}