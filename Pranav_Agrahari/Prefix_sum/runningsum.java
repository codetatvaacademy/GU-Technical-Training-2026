import java.util.Arrays;

public class runningsum {

    public static int[] prefixsum (int arr[]){

        for (int i = 1; i < arr.length; i++) {
         arr[i] += arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(Arrays.toString(prefixsum(arr)));
    }
}
