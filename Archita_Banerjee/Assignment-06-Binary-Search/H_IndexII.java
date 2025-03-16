import java.util.Arrays;
public class H_IndexII {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n=citations.length;
        int [] arr= new int[n+1];
        for(int c:citations){
            if(c>=n){
                arr[n]++;
            }else{
                arr[c]++;
            }
        }
        int sum=0;
        for(int i=n;i>=0;i--){
            sum +=arr[i];
            if(sum>=i){
                return i;
            }
        }
        return 0;
    }
}
