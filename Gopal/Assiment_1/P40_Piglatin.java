import java.util.Scanner;

public class P40_Piglatin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str) ;
        char c = str.charAt(0) ;
        if ( c == 'a' || c == 'e' || c  == 'i' || c == 'o' || c == 'u') {
            sb.append("way");
            System.out.println(sb);
        }else{
            sb.append(c) ;
            sb.append("ay") ;
            System.out.println(sb.substring(1));
        }

    }
}
