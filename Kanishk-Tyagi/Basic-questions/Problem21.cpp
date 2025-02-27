// WAP to calculate the area of rectangle, circle and triangle as per user's choice.
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    double area_of_triangle(int base, int height){
        return 0.5 * base * height;
    }
    double area_of_rectangle(int length, int breadth){
        return length * breadth;
    }
    double area_of_circle(int radius){
        return  3.141 * radius*radius;
    }
};
int main(){
    solution sol;
    cout << "Select shape" << endl;
    cout << "1 - circle" << endl;
    cout << "2- rectangle" << endl;
    cout << "3-triangle" << endl;
    int input;
    cin >> input;
    if(input==1){
        int radius;
        cin >> radius;
        cout<<sol.area_of_circle(radius);
    }
    else if(input==2){
        int l, b;
        cin >> l >> b;
        cout << sol.area_of_rectangle(l, b);
    }
    else if(input==3){
        int base, height;
        cin >> base >> height;
        cout << sol.area_of_triangle(base, height);
    }
    else{
        cout << "Invalid Input";
    }
    return 0;
}