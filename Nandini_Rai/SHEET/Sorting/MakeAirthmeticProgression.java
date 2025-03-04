import java.util.Arrays;
import java.util.Scanner;

public class MakeAirthmeticProgression {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d = Math.abs(arr[0] - arr[1]);
        for(int i=2;i<arr.length;i++){
            int d1 =arr[i]-arr[i-1];
            if(d1!=d) return false;
        }
        return true;
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    MakeAirthmeticProgression ap = new MakeAirthmeticProgression();
    System.out.println(ap.canMakeArithmeticProgression(arr));
   }
}
