class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int rowSumMax=Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int rowSum=0;
            for(int j=0;j<accounts[0].length;j++){
                rowSum+=accounts[i][j];
            }
            if(rowSum>rowSumMax){
                rowSumMax=rowSum;
            }
        }
        return rowSumMax;
    }
}