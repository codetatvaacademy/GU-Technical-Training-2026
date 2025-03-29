import java.util.Scanner;

public class thePoetsDilemma{
    public static void longestSubstring(String s){
        int start = 0;
        int end = 0;
        int length = 0;
        while(start <= end){
            for(int i = 0; i < s.length(); i++){
                if(char[s] == "a"){
                    length++
                }else if(char[s +1] "a" || "e" || "i" || "o" ||"u"){
                    legth++;
                }
                else{
                    start = end;
                    start++;
                    length++;
                }
                end++;
            }
        }
        return Math.max(maxlength, length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("The longest Substring is:" + longestSubstring(s));
        sc.close();
    }
}

//time complexity of the function : O(n)
// space complexity of the function : O(1)

// time complexity of the whole program : O(n)
// space complexity of the whole program : O(n)