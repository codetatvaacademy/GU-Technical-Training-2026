import java.util.Scanner;

public class AnalyseInputCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        sc.close();
        if(ch>=48 && ch<=57){
            System.out.println(ch + " is a digit.");
        }
        else if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
            System.out.println(ch + " is an alphabet.");
        }
        else{
            System.out.println(ch + " is a special symbol.");
        }
    }
}