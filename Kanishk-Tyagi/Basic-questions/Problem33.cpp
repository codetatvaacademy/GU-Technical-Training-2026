// WAP to take input a number from the user and check whether it is palindrome.
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    bool isPalindrome(int n){
        string str = to_string(n);
        string rev_str = str;
        reverse(rev_str.begin(), rev_str.end());
        return str == rev_str;
    }
};
int main(){
    int n;
    cin >> n;
    solution sol;

    if(sol.isPalindrome(n)){
        cout << "Palindrome";
    }
    else{
        cout << "not a palindrome";
    }
}