#include<iostream>
using namespace std;

int Convert2Paise(int n){
    int paise = n* 100;
    cout<<n<<"rs = "<<paise<<"paise"<<endl;
}
int main(){
    int money;
    cout<<"Enter the value of money in rs:";
    cin>>money;
    Convert2Paise(money);

return 0;
}