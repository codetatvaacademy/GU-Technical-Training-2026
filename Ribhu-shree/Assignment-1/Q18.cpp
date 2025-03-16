#include<iostream>
using namespace std;

void Descending(int a,int b,int c){
    if(a<b) swap(a,b);
    if(a<c) swap(a,c);
    if(b<c) swap(b,c);
    cout<<"Numbers in descending order: "<<a<<" "<<b<<" "<<c<<endl;
}

int main(){
    int a,b,c;
    cout<<"Enter three numbers:";
    cin>>a>>b>>c;

    Descending(a,b,c);

    return 0;
}
