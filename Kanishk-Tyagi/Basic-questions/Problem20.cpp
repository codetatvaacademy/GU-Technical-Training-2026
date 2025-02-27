// WAP to perform arithmetic operations as per user's choice.
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    void calculator(int a, char op, int b){
        switch(op){
            case '+':
                cout << a << " + " << b <<" = "<< a + b << endl;
                break;
            case '-':
                cout << a << " - " << b << " = "<< a - b << endl;
                break;
            case '*':
                cout << a << " * " << b << " = " << a * b << endl;
                break;
            case '/':
            if(b==0){
                cout << "Error divided by zero" << endl;
            }
            else{
                cout << a << " / " << b << " = " << a / b << endl;
             } break;
            default:
                cout << "Invalid Input" << endl;
        }
    }
};
int main(){
    int a, b;
    char op;
    cin >> a;
    cin >> op;
    cin >> b;
    solution sol;
    
    sol.calculator(a, op, b);
    return 0;
}