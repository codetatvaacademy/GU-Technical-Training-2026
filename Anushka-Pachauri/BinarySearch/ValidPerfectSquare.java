class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if(num<1){
            return false;
        }
        int min=1;
        int max=num;
        while(min<=max){
            int mid=(max+min)/2;
            if(num/mid==mid && num%mid==0){
                return true;
            }
            else if(num/mid<mid){
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return false;
    }
}