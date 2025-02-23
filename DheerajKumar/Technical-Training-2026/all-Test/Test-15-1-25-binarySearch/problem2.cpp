/*
875
 */



#include<iostream>
#include<vector>
#include<limits.h>
#include<algorithm>

using namespace std;

class Solution {
bool validCapacity(vector<int>& pile, int hours, int capacityToEat) {
    int totalHours = 0;

    for (int bananas : pile) {
        totalHours += (bananas + capacityToEat - 1) / capacityToEat;

        if (totalHours > hours) {
            return false;
        }
    }

    return true;
}
public:
    int minEatingSpeed(vector<int>& pile, int hours){
        if(pile.size() > hours){
            return -1;
        }
        
        int minimumCapacity = 1, maximumCapacity = *max_element(pile.begin(), pile.end()), actualCapacity = 0;

        for(int i = 0; i < pile.size(); i++){
            minimumCapacity = min(minimumCapacity, pile[i]);
            maximumCapacity = max(maximumCapacity, pile[i]);
        }

        while (minimumCapacity <= maximumCapacity){

            actualCapacity = minimumCapacity + (maximumCapacity - minimumCapacity) / 2;

            if(validCapacity(pile, hours, actualCapacity)){
                maximumCapacity = actualCapacity - 1;
            }
            
            else{
                minimumCapacity = actualCapacity + 1;
            }
        }

        return minimumCapacity;
        
    }

};






int main(){
    Solution test;

    int size = 0;
    cout<<"\nEnter the no.  of pile ->";
    cin>>size;

    vector<int> array(size, 0);
    for(int i = 0; i < size; i++){
        cout<<"\nenter the "<< i + 1<<"th pile banana count -> ";
        cin>>array[i];
    }

    int hours = 0, result = 0;
    cout<<"\n\tEnter hours -> ";
    cin>>hours;

    result = test.minEatingSpeed(array, hours);

    if(result == -1){
        cout<<"\n\tNot Possible!";
    }
    else{
        cout<<"\n\tCapacity to eat ->> "<< result;
    }
}


/*

complaxity - time O(n log(n)) excluidng input complaxity
             space O(1) excluding input complaxity
             */