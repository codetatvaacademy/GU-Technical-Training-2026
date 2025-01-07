package Vikash_Kumar_Sharma.Recursion;

public class SumOfNumber {
    public static void main(String[] args) {
        int res=sum(5,10);
        System.out.println("Sum of number b/w to numbers :"+res);
    }
    public static int sum(int start, int end){
        if(end>start){
            return end+sum(start,end-1);
        }
        else{
            return end;
        }
    }
}
