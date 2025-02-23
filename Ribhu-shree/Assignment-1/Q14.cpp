#include<iostream>
using namespace std;
float netamount(float amount){
  return amount *0.15;
}
int main(){

    float rate,amount;
    int quantity;
    cout<<"Enter rate and quantity:";
    cin>>rate>>quantity;

    amount = rate*quantity;
    float net = 0;
    if(amount < 2000){
        net = amount;
    }else{
        net = amount  - netamount(amount);
    }

    cout<<"amount to be paid: "<<netamount<<endl;
    return 0;
}

