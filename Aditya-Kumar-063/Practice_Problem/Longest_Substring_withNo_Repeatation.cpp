#include <iostream>
#include <unordered_set>
#include <string>
#include <algorithm> // for max
using namespace std;

int solve(string str) {
    if (str.size() == 0)
        return 0;
    int maxans = INT_MIN;
    unordered_set<char> set; // Changed type to char for character storage
    int l = 0;
    for (int r = 0; r < str.length(); r++) // outer loop for traversing the string
    {
        if (set.find(str[r]) != set.end()) // if duplicate element is found
        {
            while (l < r && set.find(str[r]) != set.end()) {
                set.erase(str[l]);
                l++;
            }
        }
        set.insert(str[r]);
        maxans = max(maxans, r - l + 1);
    }
    return maxans;
}

int main() {
    string str;
    
    // Taking input from the user
    cout << "Enter the string: ";
    cin >> str;

    // Output the result
    cout << "The length of the longest substring without repeating characters is: " 
         << solve(str) << endl;

    return 0;
}
