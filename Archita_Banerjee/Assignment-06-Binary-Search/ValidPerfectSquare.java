public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if(num <2){
            return true;
        }
        long min=2;
        long max=num;
        while(min<=max){
            long mid= (max+min)/2;
            long ans= mid*mid;
            if(ans==num){
                return true;
            }else if(ans<num){
                min=mid+1;
            }else{
                max=mid-1;
            }
        }
        return false;
    }
}
