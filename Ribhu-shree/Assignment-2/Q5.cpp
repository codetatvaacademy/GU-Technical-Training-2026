#include<iostream>
using namespace std;

int main(){
    int n,evensum=0,oddsum=0,evencount=0,oddcount=0;
    cout<<"Enter the number of elements: ";
    cin>>n;

    int arr[n];
    cout<<"Enter "<<n<<" elements: ";
    for(int i=0;i<n;i++){
        cin>>arr[i];
        if(arr[i]%2==0){
            evensum+=arr[i];
            evencount++;
        }else{
            oddsum+=arr[i];
            oddcount++;
        }
    }

    if(evencount>0) {
        cout<<"Average of even numbers: "<<(float)evensum/evencount<<endl;
    }
    else{
        cout<<"No even numbers in array"<<endl;
    } 

    if(oddcount>0) {
        cout<<"Average of odd numbers: "<<(float)oddsum/oddcount<<endl;
    }
    else {
        cout<<"No odd numbers in array"<<endl;
    }

    return 0;
}
