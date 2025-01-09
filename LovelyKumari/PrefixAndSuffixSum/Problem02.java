package LovelyKumari.PrefixAndSuffixSum;
class Problem02 {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        
        int[] sweepLine = new int[n + 1];
        
        // start and end of bookings is marked 
        for (int[] booking : bookings) {
            int start = booking[0] - 1; //0-based index
            int end = booking[1];      // Leave as 1-based for simplicity in the range
            int seats = booking[2];    // Number of seats booked
            
            sweepLine[start] += seats; // Add seats at the start of the range
            if (end < n) {
                sweepLine[end] -= seats; // Remove seats just after the end of the range
            }
        }
        
        //Prefix sum calculation to get the number of passengers on each flight
        int[] ans = new int[n];
        int currentPassengers = 0;
        for (int i = 0; i < n; i++) {
            currentPassengers += sweepLine[i];
            ans[i] = currentPassengers;
        }
        
        return ans;
    }
}
 //Time complexity : O(n+m) n-> number of flights and m-> number of bookings ; Space complexity : O(n) -> As sweepLine and ans array is used
