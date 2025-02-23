import java.util.*;
class DescendingThree{
    static int[] descendingOrder(int[] num){
        for(int i=0;i<num.length-1;i++){
            for(int j=0;j<num.length-i-1;j++){
                if(num[j]<num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        return num;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] num=new int[3];
        System.out.println("Enter three numbers:");
        num[0]=sc.nextInt();
        num[1]=sc.nextInt();
        num[2]=sc.nextInt();
        System.out.println("Numbers in descending order are: "+Arrays.toString(descendingOrder(num)));
    }
}