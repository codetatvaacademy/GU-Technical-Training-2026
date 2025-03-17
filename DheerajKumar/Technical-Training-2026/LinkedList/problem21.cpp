/*21. Merge Two Sorted Lists
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.*/

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
        ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
            ListNode obj(0);
            ListNode *ptr = &obj;
    
            while(list1 != nullptr && list2 != nullptr){
                if(list1->val < list2->val){
                    ptr->next = list1;
                    list1 = list1->next;
                }
                else{
                    ptr->next = list2;
                    list2 = list2->next;
                }
                ptr = ptr->next;
            }
    
            ptr->next = (list1 != nullptr) ? list1 : list2;
            return obj.next;
        }
    };


int main(){
    ListNode *head1 = nullptr, *head2 = nullptr, *tail;
    vector<int> list = {1, 2, 4}, list2 = {1, 3, 4};

    for(auto element : list){
        ListNode *listNode1 = new ListNode(element);
        if(!head1){
            head1 = tail = listNode1;
        }
        else{
            tail->next = listNode1;
            tail = listNode1;
        }
    }

    for(auto element : list2){
        ListNode *listNode2 = new ListNode(element);
        if(!head2){
            head2 = tail = listNode2;
        }
        else{
            tail->next = listNode2;
            tail = listNode2;
        }
    }

    Solution test;
    
    ListNode *Head = test.mergeTwoLists(head1, head2);
    while(Head){
        cout<<Head->val<<"\n";
        Head = Head->next;
    }
    return 0;
}