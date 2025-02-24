import java.util.Scanner;

public class palindrome {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNum  = num;
        int reversed  = 0;
while (num!=0){
    int digit = num%10;
    reversed  = reversed*10+digit;
    num = num/10;
}

if(originalNum==reversed){
    System.out.println(originalNum + " is palindrome");
}
else
System.out.println(originalNum + "  is not palindrome");
    }
    
}

    

