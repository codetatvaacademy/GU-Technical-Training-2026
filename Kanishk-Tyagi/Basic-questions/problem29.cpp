// WAP to input a number from user and print its table.
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    void print_table(int n){
        for (int i = 1; i <= 10;i++){
            cout << n << " X " << i << " = " << i * n << endl;
        }
    }
};
int main(){
    int num;
    cin >> num;
    solution sol;
    sol.print_table(num);
    return 0;
}