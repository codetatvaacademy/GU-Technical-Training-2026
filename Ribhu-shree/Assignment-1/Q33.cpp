#include<iostream>
using namespace std;

bool isPalindrome(int num){
    int before=num,rev=0,digit;
    while(num>0){        
        rev=rev*10 + num%10;   
        num/=10;                   
    }  
    return before==rev;       
}

int main(){
    int num;
    cout<<"Enter a number: ";
    cin>>num;

    if(isPalindrome(num)){
        cout<<num<<" is a Palindrome number."<<endl;
    }else{
        cout<<num<<" is NOT a Palindrome number."<<endl;
    }

    return 0;
}
