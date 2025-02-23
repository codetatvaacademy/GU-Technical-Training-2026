#include <iostream>
#include <vector>
using namespace std;

//1>
//Overall codes time complexity is O(logn)
//Overall codes space complexity is O(1)
int findFirstOccurrence(const vector<int>& arr, int target) {
    
    int low = 0, high = arr.size() - 1, result = -1;
    
    while (low <= high) { //using binary search O(logn)
    
        int mid = low + (high - low) / 2;
    
        if (arr[mid] == target) {
    
            result = mid;
    
            high = mid - 1;
    
        } else if (arr[mid] < target) {
    
            low = mid + 1;
    
        } else {
    
            high = mid - 1;
    
        }
    
    }
    
    return result;

}

int findLastOccurrence(const vector<int>& arr, int target) {
    
    int low = 0, high = arr.size() - 1, result = -1;
    
    while (low <= high) {   //using binary search O(logn)
    
        int mid = low + (high - low) / 2;
    
        if (arr[mid] == target) {
    
            result = mid;
    
            low = mid + 1;
    
        } else if (arr[mid] < target) {
    
            low = mid + 1;
    
        } else {
    
            high = mid - 1;
    
        }
    
    }
    
    return result;

}


int countOccurrences(const vector<int>& arr, int target) {

    int first = findFirstOccurrence(arr, target);
    
    if (first == -1) return 0;
    
    int last = findLastOccurrence(arr, target);
    
    return last - first + 1;


//     int count = 0;

//     for(int i = 0; i < arr.size(); i++) { //using for loop O(n)

//         if(arr[i] == target) {

//             count++;

//         }

//     }

//     return count;

    //return count(arr.begin(), arr.end(), target); //using in built function

}

//2>
//Overall codes time complexity is O(nlogn)
//Overall codes space complexity is O(1)
bool canEatAllBananas(const vector<int>& piles, int k, int h) {

    int hours = 0;

    for (int pile : piles) {    //using for loop O(n)

        hours += (pile + k - 1) / k;

    }

    return hours <= h;

}

int minEatingSpeed(vector<int>& piles, int h) {

    int left = 1, right = *max_element(piles.begin(), piles.end());

    while (left < right) {  //using binary search O(logn)

        int mid = left + (right - left) / 2;

        if (canEatAllBananas(piles, mid, h)) {

            right = mid;

        } else {

            left = mid + 1;

        }

    }

    return left;

}

//3>
//Overall codes time complexity is O(nlogn)
//Overall codes space complexity is O(1)
bool canRepairAllCars(const vector<int>& ranks, int cars, long long time) {

    long long totalCars = 0;
    
    for (int rank : ranks) { //using for loop O(n)
    
        totalCars += sqrt(time / rank);
    
        if (totalCars >= cars) return true;
    
    }
    
    return totalCars >= cars;

}

long long minTimeToRepairCars(vector<int>& ranks, int cars) {

    long long left = 1, right = *max_element(ranks.begin(), ranks.end()) * cars * cars;

    while (left < right) { //using binary search O(logn)

        long long mid = left + (right - left) / 2;

        if (canRepairAllCars(ranks, cars, mid)) {

            right = mid;

        } else {

            left = mid + 1;

        }

    }

    return left;

}


//Main function
int main() {
    //For 1st function
    int n;

    vector<int> arr;
    
    cin >> n;
    
    for(int i = 0; i < n; i++) {
    
        int x;
    
        cin >> x;
    
        arr.push_back(x);
    
    }
    
    int target;
    
    cin >> target;
    
    cout << countOccurrences(arr, target);

    //For 2nd function
    int n;

    vector<int> piles;

    cin >> n;

    for(int i = 0; i < n; i++) {

        int x;

        cin >> x;

        piles.push_back(x);

    }

    int h;
    
    cin >> h;
    
    cout << minEatingSpeed(piles, h);

    //For 3rd function
    int n;

    vector<int> ranks;

    cin >> n;

    for(int i = 0; i < n; i++) {

        int x;

        cin >> x;

        ranks.push_back(x);

    }

    int cars;

    cin >> cars;

    cout << minTimeToRepairCars(ranks, cars);
    
    return 0;
}