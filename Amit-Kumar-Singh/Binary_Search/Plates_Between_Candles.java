class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n = s.length();
        int m = queries.length;
        int[] answer = new int[m];

        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] plateCount = new int[n];

        if(s.charAt(0)=='|'){
            prefix[0] = 0;
            plateCount[0] = 0;
        }
        else{
            prefix[0] = -1;
            plateCount[0] = 1;
        }
        for(int i=1;i<n;i++){
            if(s.charAt(i)=='|'){
                prefix[i] = i;
                plateCount[i] = plateCount[i-1];
            }
            else{
                prefix[i] = prefix[i-1];
                plateCount[i] = plateCount[i-1]+1;
            }
        }

        if(s.charAt(n-1)=='|'){
            suffix[n-1] = n-1;
        }
        else{
            suffix[n-1] = -1;
        }
        for(int i=n-2;i>=0;i--){
            if(s.charAt(i)=='|'){
                suffix[i] = i;
            }
            else{
                suffix[i] = suffix[i+1];
            }
        }

        for(int i=0;i<m;i++){
            if(prefix[queries[i][1]]>=0 && suffix[queries[i][0]]>=0 && plateCount[prefix[queries[i][1]]] - plateCount[suffix[queries[i][0]]]>=0){
                answer[i] = plateCount[prefix[queries[i][1]]] - plateCount[suffix[queries[i][0]]];
                
            }
        }
        return answer;
    }
}