#include <unordered_set>
#include <iostream>
#include <vector>
#include <numeric>

using namespace std;

// // Q1
// // Time complexity: O(n logn)
// // Space complexity: O(1)

// int minDifferenceAfterReplacement(int N, int K, vector<int>& weights) {

//     sort(weights.begin(), weights.end());

//     int result = weights[N - 1] - weights[0];

//     for (int i = 0; i <= K; ++i) {

//         int min_val = (i < N) ? weights[i] : INT_MAX;

//         int max_val = (N - K + i - 1 >= 0) ? weights[N - K + i - 1] : INT_MIN;

//         result = min(result, max_val - min_val);

//     }

//     return result;
// }


// int main() {

//     int N, K;

//     cin >> N >> K;

//     vector<int> weights(N);

//     for (int i = 0; i < N; ++i) {

//         cin >> weights[i];

//     }

//     cout << minDifferenceAfterReplacement(N, K, weights) << endl;

//     return 0;

// }

// // Q2
// // Time complexity O(n)
// // Space complexity O(1)

bool isValidWindow(const unordered_map<char, int>& vowelCount) {

    string vowels = "aeiou";

    for (int i = 0; i < vowels.size(); ++i) {

        if (vowelCount.find(vowels[i]) == vowelCount.end()) {

            return false;

        }

    }

    return true;

}

int longestBeautifulSubstring(const string& word) {

    int n = word.size();

    int maxLength = 0;

    int left = 0;

    unordered_map<char, int> vowelCount;

    for (int right = 0; right < n; ++right) {

        char current = word[right];

        vowelCount[current]++;

        while (left <= right && (!isValidWindow(vowelCount))) {

            vowelCount[word[left]]--;

            if (vowelCount[word[left]] == 0) {

                vowelCount.erase(word[left]);

            }

            left++;

        }

        if (vowelCount.size() == 5) {

            maxLength = max(maxLength, right - left + 1);

        }

    }


    return maxLength;
    
}

int main() {

    string word;

    cin >> word;

    cout << longestBeautifulSubstring(word) << endl;

    return 0;

}



// //Q3
// //Time complexity O(n log(sum))
// //Space complexity O(1)

// bool canSplit(vector<int>& nums, int k, int maxSum) {

//     int count = 1, currentSum = 0;

//     for (int num : nums) {

//         if (currentSum + num > maxSum) {

//             count++;

//             currentSum = num;

//             if (count > k) return false;

//         } else {

//             currentSum += num;

//         }

//     }

//     return true;

// }

// int splitArray(vector<int>& nums, int k) {

//     int low = *max_element(nums.begin(), nums.end());

//     int high = accumulate(nums.begin(), nums.end(), 0);

//     int result = high;

//     while (low <= high) {

//         int mid = low + (high - low) / 2;

//         if (canSplit(nums, k, mid)) {

//             result = mid;

//             high = mid - 1;

//         } else {

//             low = mid + 1;
//         }

//     }

//     return result;

// }

// int main() {

//     int n, k;

//     cin >> n >> k;

//     vector<int> nums(n);

//     for (int i = 0; i < n; ++i) {
        
//         cin >> nums[i];

//     }

//     cout << splitArray(nums, k) << endl;

//     return 0;

// }

// //Q4
// //Time complexity O(n)
// // Space complexity O(1)

// int longestSemiRepetitiveSubstring(const string& s) {

//     int n = s.size();

//     int maxLength = 1, left = 0, repeatCount = 0;


//     for (int right = 1; right < n; ++right) {

//         if (s[right] == s[right - 1]) {

//             repeatCount++;

//         }

//         while (repeatCount > 1) {

//             if (s[left] == s[left + 1]) {

//                 repeatCount--;

//             }

//             left++;

//         }

//         maxLength = max(maxLength, right - left + 1);

//     }

//     return maxLength;

// }

// int main() {

//     string s;

//     cin >> s;

//     cout << longestSemiRepetitiveSubstring(s) << endl;

//     return 0;

// }