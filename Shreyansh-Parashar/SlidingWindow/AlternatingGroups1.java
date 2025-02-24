import java.util.*;
public class AlternatingGroups1 {
    public static int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length;
        int start = 0;
        int end  = 1;
        int value = colors[0];
        int count = 0;
        while(end < n+2){
            if(value != colors[end%n]){
                if((end - start + 1) >= 3){ 
                    count++;                  
                }
                     
            }else{
                start = end;  
            }
            value = colors[end%n]; 
            end++; 
               
        }
        return count;
    }
    public static void main(String[] args) {
        AlternatingGroups1 obj = new AlternatingGroups1();
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the size color: ");
        int n = sc.nextInt();

        // System.out.println("Enter colors 'Array'");
        int[] colors = new int[n];

        for(int i =0; i < n; i++){
            colors[i] = sc.nextInt();
        }

        int count = obj.numberOfAlternatingGroups(colors);

        System.out.println(count);
    }
}
