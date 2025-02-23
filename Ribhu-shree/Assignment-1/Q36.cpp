#include<iostream>
using namespace std;

int main(){
    int num,evenSum=0,oddSum=0,evenCount=0,oddCount=0;

    cout<<"Enter numbers:"<<endl;
    while(true){
        cin>>num;
        if(num==-1) break; 

        if(num%2==0){
            evenSum+=num;
            evenCount++;
        }else{
            oddSum+=num;
            oddCount++;
        }
    }

    if(evenCount>0){
        cout<<"Average of even numbers: "<<(float)evenSum/evenCount<<endl;
    }else{
        cout<<"No even numbers entered."<<endl;
    } 

    if(oddCount>0) {
        cout<<"Average of odd numbers: "<<(float)oddSum/oddCount<<endl;
    }else{
        cout<<"No odd numbers entered."<<endl;
    } 
    return 0;
}
