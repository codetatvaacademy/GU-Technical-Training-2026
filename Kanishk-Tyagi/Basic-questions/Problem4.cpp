// WAP to take input rupees from the user and convert it into paise.
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    int rupeestopaise(int rupees){
        return rupees * 100;
    }
};
int main(){
    solution sol;
    int rupees;
    cin >> rupees;
    cout << sol.rupeestopaise(rupees);
    return 0;
}