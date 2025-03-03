#include<iostream>
#include<cmath>
using namespace std;

bool isArmstrong(int num){
    int before=num,sum=0,digit,count=0,x=num;
    while(x>0){
        count++;
        x/=10;
    }
    x=num; 
    while(x>0){
        digit=x%10;                 
        sum+=pow(digit,count);          
        x/=10;                       
    }
    return sum==before; 
}

int main(){
    int num;
    cout<<"Enter a number: ";
    cin>>num;

    if(isArmstrong(num)){
        cout<<num<<" is an Armstrong number."<<endl;
    }else{
        cout<<num<<" is NOT an Armstrong number."<<endl;
    }

    return 0;
}
