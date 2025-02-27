import java.util.Scanner;

public class Sqrt {
        public int mySqrt(int x) {
            int min=0;
            int max = x;
            if(x==0 || x == 1) return x;
            while(min<=max){
                int mid = (min+max)/2;
                long sq1=(long)mid*mid;
                if(sq1==x){
                    return mid;
                }
                else if(sq1 < x ){
                 min=(mid+1);
                }
                else{
                    max = mid-1;
                }
            }
            return max;
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Sqrt sq = new Sqrt();
        int result = sq.mySqrt(num);
        
        System.out.println(result);
    }
}
