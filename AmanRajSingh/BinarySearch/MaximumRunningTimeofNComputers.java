class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long sum = 0;
        for(int i : batteries){
            sum+= i;
        }
        long min = 1;
        long max = sum/ n;
          
    
    while(min < max){
        long mid = max - (max - min)/2;
        long chksum = 0;

        for( int i:batteries){

            chksum+=Math.min(i,mid);
        }
        
        if( chksum >=(long)(n*mid)){
            min=mid;
        }
        else{
            max=mid+1;
        }    
    }

    return min;
    }
}

