#include<iostream>
using namespace std;

void Ifelse(int num){
    if(num==1) cout<<"Monday"<<endl;
    else if(num==2) cout<<"Tuesday"<<endl;
    else if(num==3) cout<<"Wednesday"<<endl;
    else if(num==4) cout<<"Thursday"<<endl;
    else if(num==5) cout<<"Friday"<<endl;
    else if(num==6) cout<<"Saturday"<<endl;
    else if(num==7) cout<<"Sunday"<<endl;
    else cout<<"Enter a number between 1 and 7."<<endl;
}

void Switch(int num){
    switch(num){
        case 1: cout<<"Monday"<<endl; break;
        case 2: cout<<"Tuesday"<<endl; break;
        case 3: cout<<"Wednesday"<<endl; break;
        case 4: cout<<"Thursday"<<endl; break;
        case 5: cout<<"Friday"<<endl; break;
        case 6: cout<<"Saturday"<<endl; break;
        case 7: cout<<"Sunday"<<endl; break;
        default: cout<<"Enter a number between 1 and 7."<<endl;
    }
}

int main(){
    int num;
    cout<<"Enter a number 1 to 7: ";
    cin>>num;

    cout<<"Using If Else: ";
    Ifelse(num);
    cout<<"Using Switch-Case: ";
    Switch(num);

    return 0;
}

