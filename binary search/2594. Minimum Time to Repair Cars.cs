class Solution {
    public long repairCars(int[] arr, int c) {
    
        long[] ranks = new long[arr.length];
        int idx = 0;
        for(int ele : arr)
        {
            ranks[idx++] = (ele * 1l);
        }
        Arrays.sort(ranks);
        long cars = (c * 1l);
        
        int n = ranks.length;
        long time = (int)1e14;
        long si = 0;
        long ei = Long.MAX_VALUE;

        while(si <= ei)
        {
            long mid = (si) + (ei - si)/2;
            if(helper(mid, ranks, cars))
            {
                time = mid;
                ei = mid - 1;
            }
            else
            {
                si = mid + 1;
            }
        }
        return time; 
    }
    
    public boolean helper(long mid, long[] ranks, long cars)
    {
        for(int i = 0; i < ranks.length; i++)
        {
            long x = (long)Math.floor(Math.sqrt((mid * 1.0)/(ranks[i] * 1.0)));
            if(x >= cars)
                return true;
            cars-= x;
            if(cars == 0)
                return true;
        }
        return (cars == 0);
    
        
    }
}