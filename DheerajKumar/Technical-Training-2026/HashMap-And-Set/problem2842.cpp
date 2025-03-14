/*2842. Count K-Subsequences of a String With Maximum Beauty

You are given a string s and an integer k.

A k-subsequence is a subsequence of s, having length k, and all its characters are unique, i.e., every character occurs once.

Let f(c) denote the number of times the character c occurs in s.

The beauty of a k-subsequence is the sum of f(c) for every character c in the k-subsequence.

For example, consider s = "abbbdd" and k = 2:

f('a') = 1, f('b') = 3, f('d') = 2
Some k-subsequences of s are:
"abbbdd" -> "ab" having a beauty of f('a') + f('b') = 4
"abbbdd" -> "ad" having a beauty of f('a') + f('d') = 3
"abbbdd" -> "bd" having a beauty of f('b') + f('d') = 5
Return an integer denoting the number of k-subsequences whose beauty is the maximum among all k-subsequences. Since the answer may be too large, return it modulo 109 + 7.

A subsequence of a string is a new string formed from the original string by deleting some (possibly none) of the characters without disturbing the relative positions of the remaining characters.

Notes

f(c) is the number of times a character c occurs in s, not a k-subsequence.
Two k-subsequences are considered different if one is formed by an index that is not present in the other. So, two k-subsequences may form the same string.
 

Example 1:

Input: s = "bcca", k = 2
Output: 4
Explanation: From s we have f('a') = 1, f('b') = 1, and f('c') = 2.
The k-subsequences of s are: 
bcca having a beauty of f('b') + f('c') = 3 
bcca having a beauty of f('b') + f('c') = 3 
bcca having a beauty of f('b') + f('a') = 2 
bcca having a beauty of f('c') + f('a') = 3
bcca having a beauty of f('c') + f('a') = 3 
There are 4 k-subsequences that have the maximum beauty, 3. 
Hence, the answer is 4. 
Example 2:

Input: s = "abbcd", k = 4
Output: 2
Explanation: From s we have f('a') = 1, f('b') = 2, f('c') = 1, and f('d') = 1. 
The k-subsequences of s are: 
abbcd having a beauty of f('a') + f('b') + f('c') + f('d') = 5
abbcd having a beauty of f('a') + f('b') + f('c') + f('d') = 5 
There are 2 k-subsequences that have the maximum beauty, 5. 
Hence, the answer is 2. 
 

Constraints:

1 <= s.length <= 2 * 105
1 <= k <= s.length
s consists only of lowercase English letters.*/

#include <iostream>
#include <vector>
#include <string>
#include <queue>

using namespace std;

class Solution {
    int MOD = 1000000007;
    
    long long power(int x, int n) {
        if( n == 0) return 1;
        
        long long ans = power(x, n / 2);
        ans *= ans;
        ans %= MOD;
        
        if(n % 2 != 0) {
            ans *= x;
            ans %= MOD;
        }
        
        return ans;
    }
    
    long long fact(int n) {
        long long ans = 1;
        
        for(int i = 1; i <= n; i++) {
            ans *= i;
            ans %= MOD;
        }
        
        return ans;
    }
    
    long long nCr(int n, int r) {
        long long ans = fact(n);
        long long denominator = (fact(r) * fact(n - r)) % MOD;
        
        return (ans * power(denominator, MOD - 2)) % MOD;
    }
    
public:
    int countKSubsequencesWithMaxBeauty(string s, int k) {
        priority_queue<int> pq;
        
        vector<int> freq(26);
        for(auto x:s) {
            freq[x - 'a'] += 1;
        }
        
        for(int i = 0; i < 26; i++) {
            if(freq[i] > 0) pq.push(freq[i]);
        }
        
        if(pq.size() < k) {
            return 0;
        }
        
        long long ans = 1;
        while(k > 0) {
            int countEqual = 0, ele = pq.top();
            while(pq.size() > 0 && pq.top() == ele) {
                countEqual += 1;
                pq.pop();
            }
            
            if(countEqual <= k) {
                k -= countEqual;
                ans *= power(ele, countEqual);
                ans %= MOD;
            } else {
                ans *= power(ele, k);
                ans %= MOD;
                
                ans *= nCr(countEqual, k);
                ans %= MOD;
                break;
            }
        }
        
        return ans;
    }
};


int main(){
    int numberOfTestCase;
    cout<<"\n\tEnter number of Test Case -> ";
    cin>>numberOfTestCase;
    cin.ignore();

    for(int i = 0; i < numberOfTestCase; i++){
        string input;
        cout<<"Enter string -> ";
        getline(cin, input);
        
        int k;
        cout<<"Enter k -> ";
        cin>>k;

        Solution test;
        cout<<"The number of possible sub sets is -> "<<test.countKSubsequencesWithMaxBeauty(input, k);
    }
}