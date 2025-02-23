import java.util.*;

class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> ans = new ArrayList<>();
        int i = 0, j = 0;
        
        while (i < firstList.length && j < secondList.length) {
            int startMax = Math.max(firstList[i][0], secondList[j][0]);
            int endMin = Math.min(firstList[i][1], secondList[j][1]);

            if (startMax <= endMin) {
                ans.add(new int[]{startMax, endMin});
            }
            
            if (firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }
        }
        
        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.print("Enter number of intervals in first list: ");
        int n1 = scanner.nextInt();
        int[][] firstList = new int[n1][2];
        System.out.println("Enter intervals for first list:");
        for (int i = 0; i < n1; i++) {
            firstList[i][0] = scanner.nextInt();
            firstList[i][1] = scanner.nextInt();
        }

        System.out.print("Enter number of intervals in second list: ");
        int n2 = scanner.nextInt();
        int[][] secondList = new int[n2][2];
        System.out.println("Enter intervals for second list:");
        for (int i = 0; i < n2; i++) {
            secondList[i][0] = scanner.nextInt();
            secondList[i][1] = scanner.nextInt();
        }

        int[][] result = solution.intervalIntersection(firstList, secondList);

        System.out.println("Intersecting intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }

        scanner.close();
    }
}
