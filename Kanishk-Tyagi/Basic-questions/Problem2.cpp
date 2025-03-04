// WAP to take input 1 number from the user and print its square and cube.
#include<iostream>
using namespace std;
class Solution{
    public :
        int Cubeofx(int x){
            return x * x * x;
        } int squareofx(int x){
            return x * x;
        }
};
int main(){
    //Solution sol;
    int x;
    cin >> x;
    Solution sol;
    cout << "cube of " << x << " is " << sol.Cubeofx(x);
    cout << "square of " << x << " is " << sol.squareofx(x);
}