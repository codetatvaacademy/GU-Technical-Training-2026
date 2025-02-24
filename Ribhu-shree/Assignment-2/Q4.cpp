#include<iostream>
using namespace std;

int main(){
    int n,evensum=0,oddsum=0;
    cout<<"Enter the number of elements: ";
    cin>>n;

    int arr[n];
    cout<<"Enter "<<n<<" elements: ";
    for(int i=0;i<n;i++){
        cin>>arr[i];
        if(arr[i]%2==0) evensum+=arr[i];
        else oddsum+=arr[i];
    }

    cout<<"Sum of even numbers: "<<evensum<<endl;
    cout<<"Sum of odd numbers: "<<oddsum<<endl;

    return 0;
}
