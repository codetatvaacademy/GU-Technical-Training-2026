import java.util.Scanner;

public class KokoEatingBanana {
        public boolean isValid(int piles[],int mid, int h){
            int hour =0;
            for(int i=0;i<piles.length;i++){
                hour +=(piles[i]/mid);
                if(piles[i]%mid!=0){
                  hour += 1;
                }
            }
            if(hour>h){
                return false;
            }
            return true;
        }
        public int minEatingSpeed(int[] piles, int h) {
            int min =1;
            int max =0;
            for(int i=0;i<piles.length;i++){
                max = Math.max(max,piles[i]);
            }
            while(min<max){
                int mid = (min+max)/2;
                if(isValid(piles,mid,h)){
                    max = mid;
                }
                else{
                    min = mid+1;
                }
            }
            return  min;
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] piles = new int[n];
    
        for (int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
        }

        int h = sc.nextInt();

        KokoEatingBanana kb = new KokoEatingBanana();
        int result = kb.minEatingSpeed(piles, h);

        System.out.println(result);
    }
}
