# include <iostream>
using namespace std;
int findSum(int a[], int size){
    if(size==0){
        return 0;
    }
    return a[0] + findSum(a+1,size-1);
}

int main(){
    int a [] = {12,87,19,20,38};
    cout<<"The sum of array element is "<< findSum(a,5);
    return 0;
}