class MinimumTimeToRepairCars {
    public boolean isValid(int[] ranks, int cars, long minTime){
        int count=0;
        for(int r : ranks){
            count+=(int)Math.floor(Math.sqrt(minTime/r));
            if(count>=cars){
                return true;
            }
        }
        return false;
    }
    public long repairCars(int[] ranks, int cars) {
        long min=1;
        long max=0;
        for(int r : ranks){
            max=Math.max(max,r);
        }
        max=max*1L*cars*cars;

        while(min<max){
            long mid=(min+max)/2;
            if(isValid(ranks,cars,mid)){
                max=mid;
            }
            else{
                min=mid+1;
            }
        }
        return min;
    }
}