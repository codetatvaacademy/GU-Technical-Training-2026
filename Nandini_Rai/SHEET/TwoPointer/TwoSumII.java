import java.util.Scanner;
public class TwoSumII {
        public int[] twoSum(int[] numbers, int target) {
            int i = 0;
            int j = numbers.length -1;
            int result[] = new int[2];
            while (i < j) {
               int sum = numbers[i] + numbers[j];
                if (sum > target) {
                    j--;
                }
                if(sum<target){
                    i++;
                }
                if (sum == target) {
                    result[0] = i+1;
                    result[1] = j+1;
                    break;
                }
            }
            return result;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int numbers[] = new int[n];
            for(int i=0;i<numbers.length;i++){
                numbers[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            TwoSumII ts = new TwoSumII();
            int ans[] = ts.twoSum(numbers, target);
             for(int i=0;i<numbers.length;i++){
                System.out.print(ans[i]+" ");
            }
        }
}
