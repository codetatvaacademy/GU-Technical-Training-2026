import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class RabbitsinForest{
      public static int numRabbits(int[] answers) {
        int rabbits = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : answers) {
            if (map.containsKey(n)) {
                if (map.get(n) == 0) {
                    rabbits += n + 1;
                    map.put(n, n);
                } else {
                    map.put(n, map.get(n) - 1);
                }

            } else {
                map.put(n, n);
                rabbits += n + 1;
            }
        }
        return rabbits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] answers = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++){
            answers[i] = sc.nextInt();
        }
        System.out.println("The minimum number of rabbits in forest: " + numRabbits(answers));
    }
}