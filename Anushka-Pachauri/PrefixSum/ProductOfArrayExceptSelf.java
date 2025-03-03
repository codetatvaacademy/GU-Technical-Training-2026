class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] answer=new int[nums.length];
        int[] leftProduct=new int[nums.length];
        int[] rightProduct=new int[nums.length];
        leftProduct[0]=1;
        rightProduct[rightProduct.length-1]=1;
        for(int i=1;i<leftProduct.length;i++){
            leftProduct[i]=leftProduct[i-1]*nums[i-1];
        }
        for(int i=rightProduct.length-2;i>=0;i--){
            rightProduct[i]=rightProduct[i+1]*nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            answer[i]=leftProduct[i]*rightProduct[i];
        }
        return answer;
    }
}