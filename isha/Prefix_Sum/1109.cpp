class Solution {
    public:
        vector<int> corpFlightBookings(vector<vector<int>>& bookings, int n) {
             vector<int> prefixSum(n, 0);
            for (int i = 0; i < bookings.size(); ++i) {
                int start = bookings[i][0] - 1; 
                int end = bookings[i][1];      
                int seats = bookings[i][2];   
    
                prefixSum[start] += seats;
                if (end < n) {
                    prefixSum[end] -= seats;
                }
            }
            for (int i = 1; i < n; ++i) {
                prefixSum[i] += prefixSum[i - 1];
            }
    
            return prefixSum;
        }
    
            
        
    };