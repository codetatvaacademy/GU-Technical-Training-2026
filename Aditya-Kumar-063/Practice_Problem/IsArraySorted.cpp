# include <iostream>
using namespace std;
bool IsSorted(int a[], int size){
    if(size==0 || size == 1){
        return false;
    }
    if(a[0] > a[1]){
        return false;
    }

    return IsSorted(a+1, size-1);
}
int main(){
    int a [] = {12,87,19,20,38};
    if(IsSorted(a,5)){
        cout<<"Sorted";
    }else{
        cout<<"Not Sorted";
    }
    return 0;
}