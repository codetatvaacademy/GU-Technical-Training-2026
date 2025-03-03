#include<iostream>
using namespace std;

float areaRectangle(float l,float b)
{ 
    return l*b;
}
float areaCircle(float r){
    return 3.14*r*r;
}
float areaTriangle(float b,float h)
{
    return 1/2*b*h; 
}

int main(){
    int choice;
    cout<<"Choose shape to calculate area:\n";
    cout<<"1. Rectangle\n2. Circle\n3. Triangle\nEnter choice: ";
    cin>>choice;

    if(choice==1){
        float l,b;
        cout<<"Enter length and breadth: ";
        cin>>l>>b;
        cout<<"Area of Rectangle: "<<areaRectangle(l,b)<<endl;
    }
    else if(choice==2){
        float r;
        cout<<"Enter radius: ";
        cin>>r;
        cout<<"Area of Circle: "<<areaCircle(r)<<endl;
    }
    else if(choice==3){
        float b,h;
        cout<<"Enter base and height: ";
        cin>>b>>h;
        cout<<"Area of Triangle: "<<areaTriangle(b,h)<<endl;
    }
    else cout<<"Invalid"<<endl;

    return 0;
}
