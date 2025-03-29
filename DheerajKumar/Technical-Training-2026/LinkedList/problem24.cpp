/*24. Swap Nodes in Pairs
Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

Example 1:

Input: head = [1,2,3,4]

Output: [2,1,4,3]

Explanation:



Example 2:

Input: head = []

Output: []

Example 3:

Input: head = [1]

Output: [1]

Example 4:

Input: head = [1,2,3]

Output: [2,1,3]
Constraints:

The number of nodes in the list is in the range [0, 100].
0 <= Node.val <= 100*/

#include <iostream>
#include <vector>

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {
    public:
        ListNode* swapPairs(ListNode* head) {
            if(!head || !head->next)return head;
            ListNode *ptr = head, *temp = ptr->next, *previous = nullptr;
            head = head->next;
    
            while(ptr != nullptr && temp != nullptr){
                ptr->next = temp->next;
                temp->next = ptr;
    
                if(previous != nullptr){
                    previous->next = temp;
                }
                previous = ptr;
                ptr = ptr->next;
                if(ptr) temp = ptr->next;
            }
            return head;
        }
    };

    ListNode* linkListMaker(vector<int> input){
        if(input.empty()) return nullptr;
    
        ListNode *head = new ListNode(input[0]);
        ListNode *current = head;
    
        for(size_t i = 1; i < input.size(); i++){
            current->next = new ListNode(input[i]);
            current = current->next;
        }
        return head;
    }

int main(){
    vector<int> list = {1,2,3,4};
    ListNode *head = linkListMaker(list);

    Solution Testing;
    ListNode *result = Testing.swapPairs(head);

    while(result){
        cout<<result->val<<"\n";
        result = result->next;
    }
}