//14. WAP to take input rate & quantity and calculate the amount. Finally print net amount to be paid after allowing 15% discount if amount exceeds 2000 rs.

#include <iostream>
using namespace std;

float amountToBePaid(int amountPerUnit, float quantity){
    float total = quantity * amountPerUnit;
    if(total > 2000){
        total = total - (total * (15.0/100));
    }
    return total;
}

int main(){
    int amountPerUnit;
    float quantity;

    cout<<"\n\nEnter the per unit eg.(1kg, 1 piece) cost ->> ";
    cin>>amountPerUnit;
    cout<<"Enter amount that have beek perchased ->> ";
    cin>>quantity;

    cout<<"\n\n\t Total cost (discount applicable only after amount exceeds 2000 rs/- ) \n\t\t=="<<
        amountToBePaid(amountPerUnit, quantity)<<" /-";

}