// WAP to calculate the average of even and odd numbers given by user until user press -1.
#include<bits/stdc++.h>
using namespace std;
class solution{
    public:
    void calculate_average(){
        int num, evensum = 0, oddsum = 0, evencount = 0, oddcount = 0;
        while(true){
            cin >> num;
            if(num==-1){
                break;
            }
            if(num%2==0){
                evensum += num;
                evencount++;
            }
            else{
                oddsum += num;
                oddcount++;
            }
        }
        double evenavg = evencount ? (double)evensum / evencount : 0;
        double oddavg = oddcount ? (double)oddsum / oddcount : 0;
    }
};
int main(){
    solution sol;
    sol.calculate_average();
    return 0;
}