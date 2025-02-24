//WAP to take input 1 number from the user and print its square and cube.
#include <iostream>
using namespace std;

int square(int num) {
    return num * num;
}

int cube(int num) {
    return num * num * num;
}

int main() {
    int num;
    cin >> num;
    cout << "Square: " << square(num) << endl;
    cout << "Cube: " << cube(num) << endl;
    return 0;
}
