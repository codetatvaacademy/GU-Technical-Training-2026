class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n= candies.length;
        boolean flag = false;
        List<Boolean> result = new ArrayList<Boolean>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(candies[i]+extraCandies<candies[j]){
                    flag= false;
                    break;
                }
                else{
                    flag=true;
                }
            }
            result.add(flag);
        }
        return result;
    }
}