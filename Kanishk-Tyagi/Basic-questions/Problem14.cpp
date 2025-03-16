// WAP to take input rate & quantity and calculate the amount. Finally print net amount to be paid after allowing 15% discount if amount exceeds 2000 rs.
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    int billing(int rate, int quantity){
        int amount = rate * quantity;
        if(amount>2000){
            amount = amount - 0.15 * amount;
        }
        return amount;
    }
};
int main(){
    int rate, quantity;
    cin >> rate >> quantity;
    solution sol;
    cout<<sol.billing(rate, quantity)<<endl;
    return 0;
}