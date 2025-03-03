class Solution {
    private:
        bool isPossible(vector<int>& position, int mid, int m) {
            int lastPos = position[0]; 
            m--;
    
            for (int i = 1; i < position.size(); i++) {
              
                if (position[i] - lastPos >= mid) {
                    m--;
                    lastPos = position[i];
                    if (m == 0) { 
                        return true;
                    }
                }
            }
    
            return m <= 0;
        }
    
        public:
            int maxDistance(vector<int> & position, int m) {
               
                sort(position.begin(), position.end());
                 int start = 1;
                int end = position.back() - position.front();
               
                
    
                while (start <= end) {
                   int mid = (start + end) / 2;
                    if (isPossible(position, m, mid)) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
               return end; 
            }
        
    
        };