package Binarysearch;


class maxtimeofncomp {

    public boolean isvalid (int []batter,long val,int m){
       long sum1=0;
        for(long i:batter){
           sum1+= Math.min(i,val);
        }
     if(sum1>=val*m){
        return true;
     }
     return false;
    } 
    public long maxRunTime(int n, int[] batteries) {
    long sum=0;
    long minv = batteries[0];
        for(long i:batteries){
           sum=sum+i;
           if(i<minv){
            minv=i;
           }
        } 
        long result=0;
    long min = minv;
       long max= sum;
       while(min<=max){
        long mid = (min+max)/2;
        
        if(isvalid(batteries,mid,n)){
           min=mid+1;
           result=mid;
        }
        else{
          max=mid-1;
        }
       }



return result;
    }
}