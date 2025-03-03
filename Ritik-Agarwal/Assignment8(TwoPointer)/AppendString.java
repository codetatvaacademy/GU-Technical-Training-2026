import java.util.Scanner;

public class AppendString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();
        System.out.println(appendCharacters(s, t));
    }
    private static int appendCharacters(String s, String t) {
        int first = 0;
        int second = 0;
        char[] sCh = s.toCharArray();
        char[] tCh = t.toCharArray();
        while(first<sCh.length && second<tCh.length){
            if(sCh[first]==tCh[second]){
                second++;
            }
            first++;
        }
        return tCh.length-second;
    }
}
