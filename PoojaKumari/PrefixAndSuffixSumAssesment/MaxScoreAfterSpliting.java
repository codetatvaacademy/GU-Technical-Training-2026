import java.util.Scanner;

public class MaxScoreAfterSpliting {
    public static int maxScore(String s) {
            int maxValue=0;
            int zeroes=0;
            int ones=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    ones++;
                }
            }
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)=='0'){
                    zeroes+=1;
                    maxValue=Math.max(zeroes+ones,maxValue);
    
                }
                else{
                    --ones;
                    maxValue=Math.max(zeroes+ones,maxValue);
    
                }
            }
            return maxValue;
            
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the String:");
            String str=sc.next();
            int result=maxScore(str);
            System.out.print(result);
        sc.close();
    }

}
