import java.util.Scanner;

public class EqualSubstring {
        public int equalSubstring(String s, String t, int maxCost) {
            int start =0;
            int end =0;
            int cost=0;
            int maxLength = 0;
            char s1[] = s.toCharArray();
            char t1[] = t.toCharArray();
            while(end < s1.length){
              cost += Math.abs(s1[end]-t1[end]);
              while(cost > maxCost){
                cost -= Math.abs(s1[start]-t1[start]);
                start++;
              }
              maxLength = Math.max(maxLength,end - start +1);
              end++;
            }
            return maxLength;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String t = sc.nextLine();
            int maxCost = sc.nextInt();
            EqualSubstring es = new EqualSubstring();
            System.out.println(es.equalSubstring(s,t,maxCost));
        }
}
