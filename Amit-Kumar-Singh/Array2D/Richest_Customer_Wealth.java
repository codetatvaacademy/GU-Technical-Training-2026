//Time Complexity: O(m*n)
//Space Complexity: O(1)
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_wealth=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[0].length;j++){
                sum+=accounts[i][j];
            }
            if(sum>max_wealth){
                max_wealth=sum;
            }
        }
        return max_wealth;
    }
}