package Binarysearch;


class platesbetweencandles {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n= s.length();
        int[] preSum=new int[n];
        if(s.charAt(0)=='*'){
            preSum[0]=1;
        }else{
            preSum[0]=0;
        }
        for(int i=1; i<s.length(); i++){
           if(s.charAt(i)=='*'){
               preSum[i]=preSum[i-1]+1;
           }else{
               preSum[i]=preSum[i-1];
           }
        }
 
        int left[]=new int[n];
        if(s.charAt(0)!='|'){
            left[0]=-1;
        }
        for(int i=1; i<n; i++){
            if(s.charAt(i)=='|'){
                left[i]=i;
            }else{
                left[i]=left[i-1];
            }
        }

        int[] right=new int[n];
        if(s.charAt(n-1)!='|'){
            right[n-1]=-1;
        }else{
            right[n-1]=n-1;
        }
        for(int i=n-2; i>=0 ; i--){
            if(s.charAt(i)=='|'){
                right[i]=i;
            }else{
                right[i]=right[i+1];
            }
        }
        int[] ans= new int[queries.length];
        for(int i=0; i<queries.length; i++){
            int startIndex=queries[i][0];
            int endIndex=queries[i][1];
            int si=right[startIndex];
            int ei=left[endIndex];
            if(si<0 || ei<0){
                continue;
            }
            ans[i]=preSum[ei]-preSum[si] <= 0 ? 0 : preSum[ei]-preSum[si];
        }
        return ans;
    }
}