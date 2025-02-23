#include<iostream>
#include<vector>
#include<limits.h>
#include<string>

using namespace std;

class Solution {
    bool isValidSum(vector<int>& numbers, int divisionCount, int minimumSum){
        int sum = 0;
        for(int i = 0; i < numbers.size(); i++){
            sum += numbers[i];
            
            if(sum > minimumSum){
                divisionCount--;
                sum = numbers[i];
                if(divisionCount <= 0){
                    return false;
                }
            }
        }
        return true;
    }

    public:
        int splitArray(vector<int>& numbers, int divisionCount){
            if(numbers.size() <= 1){
                return numbers[0];
            }
            
            int start = 0, end = 0, minimumPossibleSum = 0;
            
            for(int i = 0; i < numbers.size(); i++){
                end += numbers[i];
                start = max(start, numbers[i]); 
            }

            while(start <= end){
                minimumPossibleSum = (end + start)/2;
                
                if(isValidSum(numbers, divisionCount, minimumPossibleSum)){
                    end = minimumPossibleSum - 1;
                }
                else{
                    start = minimumPossibleSum + 1;
                }
            }
            return start ;
        }
};

int main(){
    Solution test;
    
    vector<int> inputAndRange (2);
    cout<<"\n\tenter input -> ";
    for(int i = 0; i < 2; i++){
        cin>>inputAndRange[i];
    }

    //if any index skip at the time of input default taking it as 0;
    vector<int> numebrInput (inputAndRange[0], 0);
    cout<<"\n\tenter numebr array -> ";
    for(int i = 0; i < inputAndRange[0]; i++){
        cin>>numebrInput[i];
    }

    cout<<"\n\tthe maximum minimized sum -> "<<test.splitArray(numebrInput, inputAndRange[1] - 1);
}


/* complaxity -> time O(n * log(n) )
    space complaxity -> O(1)*/