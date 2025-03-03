#include<iostream>
using namespace std;

bool isperfect(int num){
    int sum=0;
    for(int i=1;i<num;i++){
        if(num%i==0){
            sum = sum +1;
        }
    }
   return sum == num;
}

int main(){
    int num;
    cout<<"Enter a number: ";
    cin>>num;

    if(isperfect(num)) {
        cout<<num<<" is a Perfect Number"<<endl;
    }else {
        cout<<num<<" is Not a Perfect Number"<<endl;
    }

    return 0;
}