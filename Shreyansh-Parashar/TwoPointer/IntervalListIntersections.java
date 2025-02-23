import java.util.*;

public class IntervalListIntersections {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int i = 0;
        int j = 0;
        List<int[]> ans = new ArrayList<>();
        while(i < firstList.length && j < secondList.length){
            int start = Math.max(firstList[i][0],secondList[j][0]);
            int end = Math.min(firstList[i][1],secondList[j][1]);
            
            if(start <= end){
                ans.add(new int[]{start,end});
            }

            if(firstList[i][1] < secondList[j][1]){
                i++;
            }else{
                j++;
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args) {
        IntervalListIntersections obj = new IntervalListIntersections();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] firstList = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; i < m; j++){
                firstList[i][j] = sc.nextInt();
            }
        }

        int p = sc.nextInt();
        int q = sc.nextInt();
        int[][] secondList = new int[p][q];
        for(int i = 0; i < p; i++){
            for(int j = 0; j < q; j++){
                secondList[i][j] = sc.nextInt();
            }
        }
        int[][] result = obj.intervalIntersection(firstList, secondList);
        for(int[] element : result){
            System.out.println(Arrays.toString(element));
        }

    }
}
