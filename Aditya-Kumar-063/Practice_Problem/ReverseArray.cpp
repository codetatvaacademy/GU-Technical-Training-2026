#include <iostream>
using namespace std;
void reverse(int a[], int size){
    if(size == 0 || size == 1){
        return;
    }
    int temp = a[0];
    a[0]= a[size -1];
    a[size-1] = temp;
    reverse(a+1,size-2);
}
int main(){
    int a[] = {10,20,30,40,50};
    reverse(a,5);
    for(int i = 0; i<5; i++){
        cout<<a[i]<<" ";
    }
    return 0;
}