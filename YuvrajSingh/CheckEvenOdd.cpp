#include<iostream>
using namespace std;

int CheckEvenOdd(int n){
    if(n%2 == 0)
    cout<<n<<" is a even number";
    else
    cout<<n<<" is a odd number";
}
int main(){
       int num;
       cout<<"Enter a number:";
       cin>>num; 
       CheckEvenOdd(num);
return 0;
}