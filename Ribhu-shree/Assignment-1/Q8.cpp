#include <iostream>
using namespace std;

int main() {
    int num;

    cout << "Enter a Four digit number: ";
    cin >> num;
    int arr[4];
    for(int i =3 ;i>=0;i--){
        
        arr[i] = num%10;
        num = num /10;
    }
    cout << "Digits of the number are: ";
    for (int i = 0; i < 4; i++) {
        cout << arr[i] << " ,";
    }


    return 0;
}
