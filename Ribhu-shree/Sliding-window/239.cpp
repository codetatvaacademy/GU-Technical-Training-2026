class Solution {
    public:
        vector<int> maxSlidingWindow(vector<int>& nums, int k) {
            vector<int> answer;
            priority_queue<pair<int , int>> q;
            for(int i = 0 ; i<k;i++){
                q.push({nums[i],i});
            }
            answer.push_back(q.top().first);
            for(int i =1;i<=nums.size()-k;i++){
                q.push({nums[i + k - 1], i + k - 1});
    
                while (!q.empty() && q.top().second < i) {
                    q.pop();
                }
    
                
                answer.push_back(q.top().first);
            }
            return answer;
        }
    };