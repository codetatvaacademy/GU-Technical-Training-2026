package Binarysearch;


class minimumtimetorepaircars {
    public boolean fun(int ranks[],int cars,long t){
        long a=0;
        for(int i:ranks){
            a+=Math.sqrt(t/i);
        }
        if(a>=cars) return true;
        return false;
    } 
    public long repairCars(int[] ranks, int cars) {
        long min=ranks[0];
        for(int i:ranks){
            min=Math.min(min,i);
        }
        long h=min*cars*cars;
        long l=1;
        long ans=h;
        while(l<h){
            long mid=(l+h)/2;
            if(fun(ranks,cars,mid)){
                h=mid;
                ans=mid;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
} 