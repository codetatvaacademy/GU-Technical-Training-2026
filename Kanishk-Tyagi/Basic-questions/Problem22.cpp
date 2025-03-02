#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
    void check_Input(char input)
    {
        if (isdigit(input))
        {
            cout << "Input is a Number" << endl;
        }
        else if (isalpha(input))
        {
            cout << "Input is an Alphabet" << endl;
        }
        else
        {
            cout << "Input is a Special Character" << endl;
        }
    }
};

int main()
{
    char x;
    cout << "Enter a character: ";
    cin >> x;

    Solution sol;
    sol.check_Input(x);

    return 0;
}
