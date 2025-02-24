public class AlternateGroup1 {
    public int numberOfAlternatingGroups(int[] colors) {
        int n=colors.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            int first=i;
            int second = (i+1)%n;
            int third= (i+2)%n;
            if(colors[first] != colors[second] && colors[first]==colors[third]){
                cnt++;
            }
        }
        return cnt;
    }
}
