#include<iostream>
using namespace std;

int main(){
     float rad;
     cout<<"Enter the radius of circle:";
     cin>> rad;
     float area = 3.14 * rad * rad;
     float cum =  2 * 3.14 * rad;
     cout<<"Area of cirle whose radius is "<<rad<<"cm : "<<area <<endl;
     cout<<"Circumference of circle whose radius is "<<rad<<"cm : "<<cum<<endl;

return 0;
}