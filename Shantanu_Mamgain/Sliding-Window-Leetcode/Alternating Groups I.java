class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int start = 0;
        int end = 2;
        int count = 0;
        while(start < colors.length) {
            if(colors[start] == colors[end] && colors[(start+1)%colors.length] != colors[start]){
                count++;
            }
            start ++;
            end = (end+1)%colors.length;
        }
        return count;
    }

}
