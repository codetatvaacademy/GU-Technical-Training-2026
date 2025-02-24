//18. WAP to take input 3 numbers from the user and print the numbers in the descending order.

#include<iostream>
#include<vector>
using namespace std;

void inDecendingOrder(int number1, int number2, int number3){
    int sum = number1 + number2 + number3, 
        maximum = max(number1, max(number2, number3)),
            minimum = min(number1, min(number2, number3));

    cout<<"Decending Order -> { "<<maximum;
    cout<<", "<<sum - maximum - minimum;
    cout<<", "<<minimum<<" }";
}

int main(){
    vector<int> number(3,0);
    cout<<"\n\n";
    for(int i = 0; i < 3; i++){
        cout<<"Enter ["<<i<<"] number -> ";
        cin>>number[i];
    }
    inDecendingOrder(number[0], number[1], number[2]);
}