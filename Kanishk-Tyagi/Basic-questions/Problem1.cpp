// WAP to take input 2 numbers from the user and print the sum of the numbers.
#include<bits/stdc++.h>
using namespace std;
int sum(int a, int b){
    return a + b;
}
int main(){
    int n;
    cin >> n;
    int m;
    cin >> m;
    int ans = sum(n,m);
    cout << ans<<endl;
    return 0;
}