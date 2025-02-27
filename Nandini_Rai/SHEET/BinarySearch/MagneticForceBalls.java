import java.util.Arrays;
import java.util.Scanner;

public class MagneticForceBalls {
    public boolean isValid(int position[],int mid,int m){
        m--;
        int pos = position[0];
        for(int i=1;i<position.length;i++){
           if(position[i]-pos>=mid ){
            m--;
            pos = position[i];
           }
    }
      return m<=0;
    }
    public int maxDistance(int[] position, int m) { 
        Arrays.sort(position);
        int min=1;
        int n = position.length;
        int max =position[n-1]-position[0];
        if(m==2){
          return max;
        }
        while(min<=max){
            int mid = (min+max)/2;
            if(isValid(position,mid,m)){
              min = mid+1;
            }else{
                 max = mid-1;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] position = new int[n];
       
        for (int i = 0; i < n; i++) {
            position[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        MagneticForceBalls mf = new MagneticForceBalls();
        int result = mf.maxDistance(position, m);

        System.out.println(result);
    }
}
