#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    int occurance(vector<int>& nums, int target) {
        int firstInstance = 0 , lastInstance = 0;
        if(nums.size() <= 0){
            return - 1;
        }

        //#Finding the first Instance of Target !
        vector<int> outPut(2, 0);
        int minimum = 0, maximum = nums.size() - 1, middle = 0;
        
        while(minimum <= maximum){
            middle = minimum + (maximum - minimum) / 2;
            
            if(target <= nums[middle]){
                maximum = middle - 1;
            }
            else{
                minimum = middle + 1;
            }
        }
        
        firstInstance = minimum;
        if (minimum == nums.size() || nums[minimum] != target) {
            return - 1;
        }

       
        outPut[0] = minimum;
        minimum = 0, maximum = nums.size() - 1, middle = 0;


        //#find the last instance !
        while(minimum <= maximum){
            middle = minimum + (maximum - minimum) / 2;
            
            if(target >= nums[middle]){
                minimum = middle + 1;
            }
            else{
                maximum = middle - 1;
            }
        }

        lastInstance = maximum;

        return (lastInstance - firstInstance) + 1;
    }
};


int main(){
    Solution test;

    int size = 0;
    cout<<"\nEnter the size  of array ->";
    cin>>size;

    vector<int> array(size, 0);
    for(int i = 0; i < size; i++){
        cout<<"\nenter the "<< i + 1<<"th object -> ";
        cin>>array[i];
    }

    int target = 0, result = 0;
    cout<<"\n\tEnter the targeted element -> ";
    cin>>target;

    result = test.occurance(array, target);

    if(result == -1){
        cout<<"\n\tElement not present in array !";
    }
    else{
        cout<<"\n\tno of occurance ->> "<< result;
    }
}


/*complaxity time - O(log(n) + log(n))
                    O(log(n))  for function and O(n) for Input;
                    O(log(n)) excluding input complaxity;
             
             space - O(1) for Function excluding input complaxity
                                                 O(n) for Input; */