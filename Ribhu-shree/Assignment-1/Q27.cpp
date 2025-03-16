#include<iostream>
using namespace std;

void print(int lower,int upper){
    for(int i=lower;i<=upper;i++){
        if(i %2 == 0){
            cout<<i<<endl;
        }
    } 
}

int main(){
    int lower,upper;
    cout<<"Enter lower limit: ";
    cin>>lower;
    cout<<"Enter upper limit: ";
    cin>>upper;

    if(lower>upper)
        cout<<"Not possible"<<endl;
    else
        print(lower,upper);

    return 0;
}
