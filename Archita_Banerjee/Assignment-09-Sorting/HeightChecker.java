import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int []exp= new int [heights.length];
        for(int i=0;i<exp.length;i++){
            exp[i]= heights[i];
        }
        Arrays.sort(exp);
        int cnt=0;
        for(int i=0;i<exp.length;i++){
            if(exp[i]!=heights[i]){
                cnt++;
            }
        }
        return cnt;
    }
}
