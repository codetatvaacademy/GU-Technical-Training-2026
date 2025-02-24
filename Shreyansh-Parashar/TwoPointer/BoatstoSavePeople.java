import java.util.*;

public class BoatstoSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int start = 0;
        int end = people.length - 1;
        int count = 0;
        while(start <= end){
            if(people[start] + people[end] <= limit){
                start++;
            }
            count+=1;
            end--;
        }
        return count;
    }
    public static void main(String[] args) {
        BoatstoSavePeople obj = new BoatstoSavePeople();
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();
        int[] people = new int[n];

        for(int i = 0; i < n; i++){
            people[i] = sc.nextInt();
        }

        int limit = sc.nextInt();

        int count = obj.numRescueBoats(people, limit);
        System.out.println(count);
        sc.close();
    }
}
