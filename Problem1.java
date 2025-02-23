import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] weight = new int[sc.nextInt()];
        for (int i = 0; i < weight.length; i++){
            weight[i] = sc.nextInt();
        }
        int[] leftside = new int[weight.length];
        int[] rightside = new int[weight.length];
        leftside[0] = weight[0];
        rightside[weight.length - 1] = weight[weight.length - 1];
        for (int i = 1; i < weight.length; i++){
            leftside[i] = weight[i] + leftside[i - 1];
        }
        for (int i = weight.length - 2; i >= 0; i--){
            rightside[i] = weight[i] + rightside[i + 1];
        }
        for (int i = 0; i < weight.length; i++){
            if (leftside[i] == rightside[i]) {
                System.out.println(i);
                return; 
            }
        }
        System.out.println("-1");
    }
}