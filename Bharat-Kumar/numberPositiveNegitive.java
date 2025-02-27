import java.util.Scanner;

public class numberPositiveNegitive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number<0){
            System.out.println("Negitive");
        }
        else{
            System.out.println("Positive");
        }
    }
}
