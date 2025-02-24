//21. WAP to calculate the area of rectangle, circle and triangle as per user's choice.

#include<iostream>
#include<string>
using namespace std;

int AreaOfTriangle(int base, int hight){
    return 1/2 * (base * hight);
}
int areaOfRectangle(int length, int width){
    return length * width;
}
int areaOfCircle(int radius){
    return 3.14 * (radius * radius);
}


int main(){
    string choice;
    cout<<"Enter the shapename you want to calculate area for\n\t ->>";
    getline(cin, choice);

    if(choice == "triangle"){
        int base, hight;
        cout<<"Enter base ->> ";
        cin>>base;
        cout<<"Enter hight ->>";
        cin>>hight;

        cout<<"Area = "<< AreaOfTriangle(base, hight);
        return 0;
    }
    if(choice == "rectangle"){
        int length , width;
        cout<<"Enter the length ->> ";
        cin>>length;
        cout<<"Enter the width ->> ";
        cin>>width;

        cout<<"Area = "<<areaOfRectangle(length, width);
        return 0;
    }
    if(choice == "circle"){
        int radius;
        cout<<"Enter the radius ->> ";
        cin>>radius;

        cout<<"Area = "<<areaOfCircle(radius);
        return 0;
    }

    cout<<"Shape not avilable !";
}