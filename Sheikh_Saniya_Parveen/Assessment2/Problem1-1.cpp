#include <iostream>
#include <vector>
using namespace std;

int firstOccurrence(vector<int>& arr, int target) {
    int start = 0, end = arr.size() - 1, result = -1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            result = mid;
            end = mid - 1; 
        } else if (arr[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return result;
}

int lastOccurrence(vector<int>& arr, int target) {
    int start = 0, end = arr.size() - 1, result = -1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            result = mid;
            start = mid + 1; 
        } else if (arr[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return result;
}

int countOccurrences(vector<int>& arr, int target) {
    int first = firstOccurrence(arr, target);
    if (first == -1) return 0; 
    int last = lastOccurrence(arr, target);
    return last - first + 1;
}

int main() {
    int n, target;
    cout << "Enter the number of elements in the array: ";
    cin >> n;

    vector<int> arr(n);
    cout << "Enter the elements of the sorted array:\n";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    cout << "Enter the target value: ";
    cin >> target;

    int count = countOccurrences(arr, target);
    cout << "The target " << target << " occurs " << count << " times in the array." << endl;

    return 0;
}



TIME COMPLEXITY = O(log (n)) 
SPACE COMPLEXITY = O(1) because no extra space is used