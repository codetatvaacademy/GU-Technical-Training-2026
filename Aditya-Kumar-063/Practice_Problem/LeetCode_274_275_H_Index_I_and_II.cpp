#include <iostream>
#include <vector>

using namespace std;

// Function to compute the H-Index
int hIndex(vector<int>& citations) {
    int n = citations.size();
    vector<int> arr(n + 1, 0);

    // Step 1: Count papers based on citation numbers
    for (int i = 0; i < n; i++) {
        if (citations[i] > n) {
            arr[n]++;
        } else {
            arr[citations[i]]++;
        }
    }

    // Step 2: Compute cumulative count from right to left
    for (int i = n - 1; i >= 0; i--) {
        arr[i] += arr[i + 1];
    }

    // Step 3: Find the highest possible H-Index
    for (int i = n; i >= 0; i--) {
        if (arr[i] >= i) {
            return i;
        }
    }

    return 0;
}

int main() {
    int n;
    cout << "Enter the number of papers: ";
    cin >> n;

    vector<int> citations(n);
    cout << "Enter the citation counts: ";
    for (int i = 0; i < n; i++) {
        cin >> citations[i];
    }

    int result = hIndex(citations);
    cout << "H-Index: " << result << endl;

    return 0;
}
