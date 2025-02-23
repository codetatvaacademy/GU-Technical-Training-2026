/*179. Largest Number

Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.



Example 1:

Input: nums = [10,2]
Output: "210"
Example 2:

Input: nums = [3,30,34,5,9]
Output: "9534330"


Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 109*/

#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

class Solution
{
public:
    string largestNumber(vector<int> &nums)
    {
        vector<string> newArray;

        for (auto number : nums)
        {
            newArray.push_back(to_string(number));
        }
        sort(newArray.begin(), newArray.end(),
             [](string &a, string &b)
             { return a + b > b + a; });

        string largestNumber;
        int count = 0;
        for (auto element : newArray)
        {
            for (auto character : element)
            {
                if (character == '0')
                {
                    count++;
                }
                largestNumber.push_back(character);
            }
        }

        if (count == largestNumber.size())
        {
            return "0";
        }
        return largestNumber;
    }
};

int main()
{
    int testcases;
    cout << "Enter number of TestCase - >";
    cin >> testcases;

    for (int i = 0; i < testcases; i++)
    {
        vector<int> numbers;
        int inputSize;
        cout << "\n\t Enter the Array size ->> ";
        cin >> inputSize;
        for (int j = 0; j < inputSize; j++)
        {
            int userInput;
            cin >> userInput;
            numbers.push_back(userInput);
        }
        Solution Test;
        string output = Test.largestNumber(numbers);

        cout << "Largest numebr -> "; 
        for (auto element : output)
        {
            cout<< element;
        }
        cout<<"\n";
    }
}