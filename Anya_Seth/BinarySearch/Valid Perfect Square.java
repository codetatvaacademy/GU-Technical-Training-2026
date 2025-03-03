class Solution {
    public boolean isPerfectSquare(int num) {
        long min = 1;
        long max = num/2;
        if(num == 1){
            return true;
        }
        while(min <= max){
          long mid = (min + max)/2;
          if((mid * mid) == num){
           return true;
          }
          if(isValid(num, mid)){
            min = mid + 1;
          }
          else{
            max = mid - 1;
          }
          
        }
        return false;
        }
    public boolean isValid(int num, long mid){
        if((mid * mid) <= num){
          return true;
        }
        else{
          return false;
        }
    }
}


// class Solution {
//     public boolean isPerfectSquare(int num) {
//         long min = 1;
//         long max = num / 2;
//         if (num == 1) {
//             return true;
//         }
//         while (min <= max) {
//             long mid = (min + max) / 2;
//             if (isValid(num, mid)) {
//                 min = mid + 1;
//             } else {
//                 max = mid - 1;
//             }
//             if ((mid * mid) == num) {
//                 return true;
//             }
//         }
//         return false;
//     }

//     public boolean isValid(int num, long mid) {
//         if ((mid * mid) <= num) {
//             return true;
//         } else {
//             return false;
//         }
//     }
// }
