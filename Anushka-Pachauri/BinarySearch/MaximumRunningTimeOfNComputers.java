class MaximumRunningTimeOfNComputers {
    public long maxRunTime(int n, int[] batteries) {
        long max=0;
        long min=Integer.MAX_VALUE;
        for(int battery : batteries){
            max+=battery;
            min=Math.min(battery,min);
        }
        max=max/n;
        while(min<=max){
            long mid=(min+max)/2;
            long totalTime=0;
            for(int battery : batteries){
            totalTime+=Math.min(battery,mid);
        }
            if(totalTime>=mid*n){
                min=mid+1;
            }
            else{
                max=mid-1;
            }
        }
        return max;
    }
}