#include<iostream>
using namespace std;

int sum(int num){
    int sum=0;
    for(int i=1;i<=num;i++){
        if(num%i==0){
            sum = sum +1;
        }
    }
    return sum;
}

int main(){
    int num;
    cout<<"Enter a number: ";
    cin>>num;

    cout<<"Sum of divisors of "<<num<<" is "<<sum(num)<<endl;

    return 0;
}
