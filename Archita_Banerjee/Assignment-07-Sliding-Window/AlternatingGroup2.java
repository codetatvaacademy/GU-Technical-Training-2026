public class AlternatingGroup2 {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n=colors.length;
        int start=0;
        int count1=0;
        int count2=0;
        for(int end=1; end< 2*n; end++){
            if(colors[end%n]!=colors[(end-1)%n]){
                if((end-start+1)>=k){
                    count2++;
                }
            }else{
                start=end;
            }
            if(end==n-1){
                count1=count2;
            }
        }
        return count2-count1;
    }
}
