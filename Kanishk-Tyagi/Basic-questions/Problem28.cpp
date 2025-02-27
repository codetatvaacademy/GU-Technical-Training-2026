// WAP to input a number from user and print its factorial.
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    int factorial(int n){
        if(n==0){
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= n;i++){
            fact *= i ;
        }
        return fact;
    }
};
int main(){
    int num;
    cin >> num;
    solution sol;

    cout << sol.factorial(num);
    return 0;
}