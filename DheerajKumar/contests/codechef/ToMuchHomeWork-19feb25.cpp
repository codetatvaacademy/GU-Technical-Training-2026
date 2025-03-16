/*Too Much Homework!
Chef just realized he has a ton of homework due tomorrow!

Chef has several worksheets of questions with him. Each worksheet has exactly 
Y
Y questions in it.
Chef only has the time to complete at most 
10
10 worksheets before the submission deadline.

Chef has previously answered 
X
X questions, and he needs to answer at least 
100
100 questions in total to get a full score for the homework.
Will Chef be able to get a full score?

Input Format
The only line of input will contain two space-separated integers 
X
X and 
Y
Y — the number of questions already answered by Chef, and the number of questions in each worksheet.
Output Format
For each test case, output the answer: "YES" (without quotes) if Chef can receive a full score for the homework, and "NO" (without quotes) otherwise.

Each character of the output may be printed in either uppercase or lowercase, i.e. the strings No, NO, nO, and no will be treated as equivalent.

Constraints
0
≤
X
≤
150
*/



#include<iostream>
using namespace std;

class Solution{
  public:
    bool ableToComplete(int completed, int noOfQuestions){
        if(completed + noOfQuestions * 10 >= 100){
            cout<<"Yes";
            return true;
        }
        cout<<"No";
        return false;
    }
};



int main() {
    int alreadyCompleted = 0, questionPerPaper = 0;
    
    while (cin >> alreadyCompleted >> questionPerPaper) {
        Solution solved;
        solved.ableToComplete(alreadyCompleted, questionPerPaper);
    }
}
