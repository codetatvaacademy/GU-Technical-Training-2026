class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count = 0;
        int n = colors.length-1;
        for(int i=1;i<n+2;i++){
            if(colors[(i-1)%(n+1)]==colors[(i+1)%(n+1)] && colors[i%(n+1)]!=colors[(i+1)%(n+1)]){
                count++;
            }
        }
        return count;
    }
}
