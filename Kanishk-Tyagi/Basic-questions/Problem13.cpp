#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    int largestOfthree(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return b;
        }
        else {
            return c;
        }
    }
};
int main(){
    int a, b, c;
    cin >> a >> b >> c;
    solution sol;
    cout << sol.largestOfthree(a, b, c) << endl;
    return 0;
}