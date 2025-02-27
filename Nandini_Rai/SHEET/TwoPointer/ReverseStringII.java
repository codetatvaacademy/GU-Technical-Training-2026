import java.util.Scanner;

public class ReverseStringII {
        public String reverseStr(String s, int k) {
            char s1[] = s.toCharArray();
            for(int start=0;start<s1.length;start += 2*k){
            int i=start;
            int j = Math.min(start+k-1,s1.length-1);
            while(i<j){
                char temp = s1[i];
                s1[i]= s1[j];
                s1[j]=temp;
                i++;
                j--;
            }
            }
            return new String(s1);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            int k = sc.nextInt();
            ReverseStringII rs = new ReverseStringII();
            System.out.println(rs.reverseStr(s, k));
        }
}
