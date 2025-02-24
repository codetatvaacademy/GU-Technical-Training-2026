#include<iostream>
#include<cmath>
using namespace std;

void series1(int n) {
    int sum=0;
    for(int i=1;i<=n;i++){
        sum+=i;
        cout<<sum<<" ";
    }
    cout<<endl;
}
void series2(int n) {
    int num=0;
    for(int i=1;i<=n;i++){
        num=num*10+1;
        cout<<num<<" ";
    }
    cout<<endl;
}
void series3(int n) {
    int num=0;
    for(int i=1;i<=n;i++){
        num=num*10+i;
        cout<<num<<" ";
    }
    cout<<endl;
}
void series4(int n) {
    for(int i=1;i<=n;i++){
        cout<<(i*i*i-1)<<" ";
    }
    cout<<endl;
}
void series5(int n) {
    int a=0,b=1,c;
    cout<<a<<" "<<b<<" ";
    for(int i=3;i<=n;i++){
        c=a+b;
        cout<<c<<" ";
        a=b;
        b=c;
    }
    cout<<endl;
}
void series6(int n) {
    int num=0;
    for(int i=0;i<n;i++){
        cout<<num<<" ";
        num=num*2+1;
    }
    cout<<endl;
}
void series7(int x,int n) {
    int sum=0;
    for(int i=1;i<=n;i++){
        int term=pow(x,i);
        if(i%2==0) term=-term;
        cout<<term<<" ";
        sum+=term;
    }
    cout<<"\nSum of series: "<<sum<<endl;
}

int main(){
    int i,n,x;
    cout<<"Enter the series number ";
    cin>>i;
    cout<<"Enter the value of n: ";
    cin>>n;
    switch(i){
        case 1: series1(n); break;
        case 2: series2(n); break;
        case 3: series3(n); break;
        case 4: series4(n); break;
        case 5: series5(n); break;
        case 6: series6(n); break;
        case 7: cout<<"Enter value of x: ";
                cin>>x;
                series7(x,n);
                break;
        default: cout<<"Invalid series number"<<endl;
    }
    return 0;
}
