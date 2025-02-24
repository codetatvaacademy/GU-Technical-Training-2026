//3. WAP to calculate and print area of circle and circumference of circle.

#include<iostream>
using namespace std;

float area(float radius){
    return (3.14 * radius* radius);
}

float circumference(float radius){
    return 2 * 3.14 * radius;
}

int main(){
    float radius;
    cout<<"Enter the radius -> ";
    cin>>radius;

    cout<<"\nCircumference -> "<< circumference(radius);
    cout<<"\n Area -> "<< area(radius);
}
