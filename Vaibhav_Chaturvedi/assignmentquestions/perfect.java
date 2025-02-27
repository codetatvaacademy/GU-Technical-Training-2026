import java.util.*;

class perfect{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int n = sc.nextInt();
    int sum=0;
    int m =n/2;
    for(int i=1;i<=m;i++){
        if(n%i==0){
            sum=sum+i;
        }
    }   
    if(sum==n){
        System.out.println("number is perfect");
    }
    else{
        System.out.println("not"); 
    }
   
}
}  