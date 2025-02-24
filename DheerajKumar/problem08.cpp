//8. WAP to take input 4 digit numbers from the user and print its all digits.

#include<iostream>
using namespace std;

void individualNumber(int number){
    if(number < 1000 || number >= 10000){
        cout<<" Invalid Range of the number !";
        return;
    }
    int first_number = number/1000, second_number = (number%1000)/100,
        third_number = (number%100)/10, forth_number = number%10;

    cout<<"\n\nnumbers are ->";

    cout<<"\n"<<first_number<<"\n"<<second_number;
    cout<<"\n"<<third_number<<"\n"<<forth_number;

}

int main(){
    int number;
    cout<<"\n\nEnter the number ->";
    cin>>number;

    individualNumber(number);
}