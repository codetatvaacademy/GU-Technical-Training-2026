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

    cout << "Enter number: ";
    cin >> num;

    int sq = square(num);
    int cb = cube(num);


    cout << "Square of " << num << " is: " << sq << endl;
    cout << "Cube of " << num << " is: " << cb << endl;

    return 0;
}
