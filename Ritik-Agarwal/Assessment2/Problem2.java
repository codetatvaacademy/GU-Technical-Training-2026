// time complexity -> O(nlogn) ; n->length of array
// space complexity -> O(1)

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] bananas = new int[n];
        for(int i=0; i<n; i++){
            bananas[i] = sc.nextInt();
        }
        int hours = sc.nextInt();
        sc.close();

        long end = 0;
        for(int i:bananas){
            end+=i;
        }
        long start = 1;
        while(start<=end){
            long mid = (start+end)/2;
            if(isPossible(bananas, mid, hours)){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        System.out.println(start);
    }
    private static boolean isPossible(int[] bananas, long mid, int hours){
        for(int i=0; i<bananas.length; i++){
            long hrs = (bananas[i]+mid-1)/mid;
            hours-=hrs;
        }
        return hours>=0;
    }
}
