class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int start=0;
        int end=0;
        int max=0;
        int customer=0;
        int satisfaction=0;
        for(end=0;end<grumpy.length;end++){
             if(grumpy[end]==1){
            customer+=customers[end];
           // 
        }
        else{
             satisfaction+=customers[end];
        }
            

        if(end-start+1>minutes){
            if(grumpy[start]==1){
                customer-=customers[start];
            }
            start++;
        }
        max=Math.max(max,customer);

        }
        for( end=0;end<grumpy.length;end++){
            if(grumpy[end]==0){
                customer+=customers[end];
            }
        }
        return max+satisfaction;

        
    }
}
