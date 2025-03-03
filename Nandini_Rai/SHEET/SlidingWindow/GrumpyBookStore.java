import java.util.Scanner;
public class GrumpyBookStore {
        public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
            int sum =0;
            int max =0;
            int s=0;
            int e=0;
            for(int i=0;i<grumpy.length;i++){
                if(grumpy[i]==0)
                sum += customers[i];
            }
            while(e<grumpy.length){
                if(grumpy[e]==1){
                  sum+=customers[e];
                }
                while(e-s>=minutes){
                    if(grumpy[s]==1){
                    sum-=customers[s];
                    }
                    s++;
                }
                max = Math.max(max,sum);
                e++;
            }
            return max;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int customers[] = new int[n];
            for(int i=0;i<customers.length;i++){
                customers[i] = sc.nextInt();
            }
            int grumpy[] = new int[n];
            for(int i=0;i<grumpy.length;i++){
                grumpy[i] = sc.nextInt();
            }
            int minutes = sc.nextInt();
            GrumpyBookStore gs = new GrumpyBookStore();
            System.out.println(gs.maxSatisfied(customers, grumpy, minutes));
        }
}
