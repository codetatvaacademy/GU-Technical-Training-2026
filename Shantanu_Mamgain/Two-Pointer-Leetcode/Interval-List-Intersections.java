class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int start = 0;
        int end = 0;
        int i = 0;
        int j = 0;
        ArrayList<int[]> list  = new ArrayList <>();
        while(i < firstList.length && j < secondList.length){

            start = Math.max(firstList[i][0], secondList[j][0]);
            end = Math.min(firstList[i][1], secondList[j][1]);
            if(start <= end){
                list.add(new int[] {start , end});
            }
            
            if(firstList[i][1] < secondList[j][1]){
                i++;
            }
            else{
                j++;
            }         
        }

        return list.toArray(new int[list.size()][]);
    }
}
