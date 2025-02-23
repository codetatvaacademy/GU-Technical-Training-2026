import java.net.SocketTimeoutException;
import java.util.*;
public class AlternatingGroup2 {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int start = 0;
        int end = 1;
        int value = colors[0];
        int n = colors.length;
        int count = 0;
        while(end < 2*n){           
            if(value != colors[end%n]){
                if((end - start + 1) >= k){
                    if(end<n){
                        count++;
                    }else if(start < n){
                        count++;
                    }
                }  
            }else{
                start=end;
            }
            value = colors[end%n];
            end++;
        }
        return count;      
    }
    public static void main(String[] args) {
        AlternatingGroup2 obj = new AlternatingGroup2();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of colors: ");
        int n = sc.nextInt();

        System.out.println("Enter colors: ");
        int[] colors = new int[n];

        for(int i = 0; i < n; i++){
            colors[i] = sc.nextInt();
        }

        System.out.println("Enter k 'size of subString': ");
        int k = sc.nextInt();

        int count = obj.numberOfAlternatingGroups(colors, k);

        System.out.println(count);
    }
}
