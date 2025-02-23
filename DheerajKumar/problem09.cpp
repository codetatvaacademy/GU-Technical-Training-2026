//9. WAP to check whether a number is even or odd.

#include<iostream>
using namespace std;

bool isEven(int number){
    if(number % 2 == 0){
        return true;
    }
    return false;
}

int main(){
     
    int number;
    cout<<"\n\nenter the numebr ->>";
    cin>> number;

    if(isEven(number)){
        cout<<"\n < EVEN >";
    }else{
        cout<<" \n < ODD >";
    }

}