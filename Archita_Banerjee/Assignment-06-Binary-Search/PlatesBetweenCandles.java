public class PlatesBetweenCandles {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n=s.length();
        int[] leftcandle= new int[n];
        int [] rightcandle= new int[n];
        int [] prefixPlate = new int[n];

        int cpos=-1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='|'){
                cpos=i;
            }
            leftcandle[i]= cpos;
        }
        cpos = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '|') {
                cpos = i;
            }
            rightcandle[i] = cpos;
        }
        int plate= 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='*'){
                plate++;
            }
            prefixPlate[i]=plate;
        }
        int []ans= new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int left= queries[i][0];
            int right= queries[i][1];
            int leftpos= rightcandle[left];
            int rightpos= leftcandle[right];

            if(leftpos!=-1 && rightpos!=-1 && leftpos<rightpos){
                ans[i] = prefixPlate[rightpos] - prefixPlate[leftpos];
            }else{
                ans[i]=0;
            }
        }
        return ans;
    }
}
