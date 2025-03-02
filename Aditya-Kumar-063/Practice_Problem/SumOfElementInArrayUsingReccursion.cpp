# include <iostream>
using namespace std;
int findSum(int a[], int size){
    if(size==0){
        return 0;
    }
    return a[0] + findSum(a+1,size-1);
}

int main(){
    // int a [] = {12,87,19,20,38};
    int a[10001];   // Constraints : 1 <= n <= 10^4
    int n;
    cin>>n;
    for(int i=0; i<n; i++){
        cin>>a[i];
    }
    cout<<"The sum of array element is "<< findSum(a,n);
    return 0;
}