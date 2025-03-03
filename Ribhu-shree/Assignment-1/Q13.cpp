#include <iostream>
using namespace std;

int usingNested(int a,int b,int c){
    if(a>b){
        if(a>c) return a;
        else return c;
    }
    else{
        if(b>c) return b;
        else return c;
    }
}
int usingAnd(int a,int b,int c){
    if(a>b && a>c) return a;
    else if(b>a && b>c) return b;
    else return c;
}

int main(){
    int a,b,c;
    cout<<"Enter three numbers:";
    cin>>a>>b>>c;

    cout<<"using Nested If: "<<usingNested(a,b,c)<<endl;
    cout<<"using AND Operator: "<<usingAnd(a,b,c)<<endl;

    return 0;
}
