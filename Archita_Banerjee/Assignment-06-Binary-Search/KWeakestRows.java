import java.util.Arrays;
public class KWeakestRows {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        int [] res= new int[m];
        int ans[]= new int[k];

        for(int i=0;i<m;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    cnt++;
                }
            }
            res[i]=cnt;
        }
        Arrays.sort(res);
        for(int i=0;i<k;i++){
            ans[i]=res[i];
        }
        return ans;
    }
}
