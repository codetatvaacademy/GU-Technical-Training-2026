import java.util.Scanner;
public class AlternatingGroup1 {
        public int numberOfAlternatingGroups(int[] colors) {
            int end =1;
            int start=0;
            int n = colors.length;
            int count =0;
            while(end<(n+3-1)){
                if(colors[end%n]== colors[(end-1)%n]){
                    start=end;
                }
                if(colors[end%n]!= colors[(end-1)%n] && (end-start+1) == 3 && start<end ){
                    count++;
                    start++;
                }
                end++;
            }
        return count;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int colors[] = new int[n];
            for(int i=0;i<colors.length;i++){
                colors[i] = sc.nextInt();
            }
            AlternatingGroup1 ag = new AlternatingGroup1();
            System.out.println(ag.numberOfAlternatingGroups(colors));
        } 
}
