#include <iostream>
using namespace std;

class Answer {
public:
    bool kokocanEatAll(vector<int>& piles, int givenHour, int h) { // T.C -> O(n)
        int actualHour = 0;
        for (auto x : piles) {   // Iterating in piles array
            actualHour += x / givenHour;  // taking sum of all elem by dividing each element by mid value
            if (x % givenHour != 0) {     // if the element is fully divisible update the actualHour by adding 1;
                actualHour++;             
            }
        }
        return actualHour <= h;   // return true if actualHour <= Hour         
    }
    // Applying Binary Search here for calculating min speed 
    int minSpeedKokoCanEat(vector<int>& piles, int h) {  // T.C -> O(log(n))
        int n = piles.size();
        int l = 1; // Min speed will be 1
        int r = *max_element(piles.begin(),piles.end());  // max speed will be the max element in the piles array

        while (l < r) {
            int mid = l + (r - l) / 2;
            if (kokocanEatAll(piles, mid, h)) {
                r = mid - 1;     // If condition is true check for max = mid - 1
            } else {
                l = mid + 1;    // If condition is false check for min = mid + 1
            }
        }
        // return the min value;
        cout<<"The minimum integer "<< l<<" such that KOKO can eat the bananas before the guards return";
    }
};

int main(){
    Answer ans;
    int n;    
    cout<<"Enter the Size of Piles: "<<endl;
    cin>>n;

    vector<int>piles(n);

    cout<<"Enter the elements of Piles: "<<endl;
    for(int i=0; i<n; i++){
        cin>> piles[i];
    }
    
    int h;
    cout<<"Enter the Hours in which Guards come: "<<endl;
    cin>>h;

    ans.minSpeedKokoCanEat(piles,h);
}