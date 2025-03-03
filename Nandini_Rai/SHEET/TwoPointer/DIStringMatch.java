import java.util.Scanner;

public class DIStringMatch {
        public int[] diStringMatch(String s) {
           int st=0;
           int e = s.length(); 
           int n = s.length(); 
           int result[] = new int[n+1];
         for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='I'){
               result[i]=st++;
           }
           else{
            result[i] = e--;
           }
         }
         result[n] = st;
         return result;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            DIStringMatch di = new DIStringMatch();
            int ans[] = di.diStringMatch(s);
            for(int i=0;i<s.length()+1;i++){
                System.out.println(ans[i]);
            }
        }
}
