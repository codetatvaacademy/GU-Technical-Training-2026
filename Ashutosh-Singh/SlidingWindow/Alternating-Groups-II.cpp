#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int numberOfAlternatingGroups(vector<int>& s, int k) {
        int size = s.size();
        int start = 0, end = 1;
        int bad = 0; 
        int res = 0;

        while (start < size) {
            if (s[end % size] == s[(end - 1) % size]) bad++;
            if (end - start + 1 == k) {
                if (bad == 0) res++;
                start++;
                if (s[start % size] == s[(start - 1) % size]) bad--;
            }
            end++;
        }
        return res;
    }
};

int main() {
    int n, k;
    cin >> n >> k;

    vector<int> s(n);
    for (int i = 0; i < n; ++i) {
        cin >> s[i];
    }

    Solution solution;
    cout << solution.numberOfAlternatingGroups(s, k) << endl;

    return 0;
}
