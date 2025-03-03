// WAP to take input two numbers from the user and print the largest of them.
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    int LargestOfTwo(int a, int b){
        if(a>b){
            return a;
        }
        else if(a<b){
            return b;
        }
        else{
            return -1;
        }
    }
};
int main(){
    int a;
    int b;
    cin >> a >> b;
    solution sol;

    cout << sol.LargestOfTwo(a, b);
}