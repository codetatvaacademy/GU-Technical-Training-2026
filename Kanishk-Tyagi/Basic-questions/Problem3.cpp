// WAP to calculate and print area of circle and circumference of circle.
#include<bits/stdc++.h>
using namespace std;
class Solution{
    public:
        double pi = 2 * acos(0.0);
        double area(int radius)
        {
            return pi * radius * radius;
    }
    double circumference(int radius){
        return 2 * pi * radius;
    }
};
int main(){
    Solution sol;
    int radius;
    cin >> radius;
    cout << sol.area(radius) << endl;
    cout << sol.circumference(radius) << endl;
    return 0;
}