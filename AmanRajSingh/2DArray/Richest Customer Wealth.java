class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth = 0;

        for(int i = 0; i< accounts.length; i++){
            int currentwealth = 0;

            for(int j = 0; j< accounts[i].length; j++){
                currentwealth += accounts[i][j];
            }
            maxwealth = Math.max(currentwealth , maxwealth);
        }
        return maxwealth;
    }
}