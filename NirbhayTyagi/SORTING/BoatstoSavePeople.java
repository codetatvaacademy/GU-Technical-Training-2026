import java.util.Arrays;
import java.util.Scanner;

class BoatstoSavePeople{
    public static int numRescueBoats(int[] people, int limit) {
        int start = 0;
        int end = people.length - 1;
        int cnt = 0;
        Arrays.sort(people);
        while(start <= end){
            if(people[start] + people[end] <= limit){
                cnt++;
                start++;
                end--;
            }else{
                end--;
                cnt++;
            }
        }           
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in people array:");
        int n = sc.nextInt();
        int[] people = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i =0; i < n; i++){
            people[i] = sc.nextInt();
        }
        System.out.println("Enter the value of limit:");
        int limit = sc.nextInt();
        System.out.println("The numbers of boats are: " + numRescueBoats(people, limit));
    }
}