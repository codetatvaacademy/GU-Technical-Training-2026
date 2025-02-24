#include <iostream>
using namespace std;

int secondlargest(int a,int b,int c){
    if((a>b && a<c) || (a>c && a<b)) return a;
    else if((b>a && b<c) || (b>c && b<a)) return b;
    else return c;
}

int main(){
    int a,b,c;
    cout<<"Enter three numbers:";
    cin>>a>>b>>c;
    cout<<"Second largest number is: "<<secondlargest(a,b,c)<<endl;

    return 0;
}
